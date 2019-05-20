package ac.polinema.lsp.impl;

import ac.polinema.lsp.entites.Elemen;
import ac.polinema.lsp.repositories.ElemenRepository;
import ac.polinema.lsp.repositories.SkemaRepository;
import ac.polinema.lsp.services.ElemenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElemenImpl implements ElemenServices {

    @Autowired
    ElemenRepository elemenRepository;

    @Override
    public List<Elemen> findAll() {
        return elemenRepository.findAll();
    }

    @Override
    public Optional<Elemen> findById(String id) {
        return elemenRepository.findById(id);
    }

    @Override
    public Elemen save(Elemen elemen) {
        return elemenRepository.save(elemen);
    }

    @Override
    public Elemen update(String id, Elemen elemen) {
        elemen.getId_elemen();
        return elemenRepository.save(elemen);
    }

    @Override
    public void delete(String id) {
        elemenRepository.deleteById(id);
    }
}
