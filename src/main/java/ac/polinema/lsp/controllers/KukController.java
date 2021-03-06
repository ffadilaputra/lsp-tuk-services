package ac.polinema.lsp.controllers;

import ac.polinema.lsp.entites.Elemen;
import ac.polinema.lsp.entites.Kuk;
import ac.polinema.lsp.services.KukServices;
import ac.polinema.lsp.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "kuk")
public class KukController {

    @Autowired
    KukServices kukServices;

    @GetMapping
    ResponseEntity<Response> findAll() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response res = new Response();
        res.setService(this.getClass().getName() + nameOfCurrMethod);
        res.setMessage("Get All data");

        res.setData(kukServices.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(res);
    }

    @GetMapping(value = "{id}")
    ResponseEntity<Response> getById(@PathVariable("id") String id) {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get Data by Id");

        response.setData(kukServices.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PostMapping
    ResponseEntity<Response> create(@RequestBody @Validated Kuk kuk) {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Tuk Created Successfully");

        //Insert Data
        response.setData(kukServices.save(kuk));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "{id}")
    ResponseEntity<Response> update(@PathVariable("id") String id, @RequestBody @Validated Kuk kuk){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Updated Successfully");
        response.setData(kukServices.update(id,kuk));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping(value = "{id}")
    ResponseEntity<Response> deleteById(@PathVariable("id") String id){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Deleted by Id");
        kukServices.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

}
