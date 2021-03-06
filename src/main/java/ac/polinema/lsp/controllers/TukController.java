package ac.polinema.lsp.controllers;

import ac.polinema.lsp.entites.Tuk;
import ac.polinema.lsp.utils.Response;
import ac.polinema.lsp.services.TukServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "tuk")
public class TukController {

    @Autowired
    TukServices tukService;

    @GetMapping
    ResponseEntity<Response> findAll() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get All data");

        response.setData(tukService.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping(value = "{id}")
    ResponseEntity<Response> getById(@PathVariable("id") String id) {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get Data by Id");

        response.setData(tukService.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PostMapping
    ResponseEntity<Response> create(@RequestBody @Validated Tuk tuk) {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Tuk Created Successfully");

        //Insert Data
        response.setData(tukService.save(tuk));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "{_id}")
    ResponseEntity<Response> update(@PathVariable("_id") String id, @RequestBody @Validated Tuk tuk){

        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Updated Successfully");
        //Update Data

        response.setData(tukService.update(id,tuk));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping(value = "{_id}")
    ResponseEntity<Response> deleteById(@PathVariable("_id") String id){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Deleted by Id");

        tukService.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

}
