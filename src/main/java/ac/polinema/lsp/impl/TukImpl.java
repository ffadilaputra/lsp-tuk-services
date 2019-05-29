package ac.polinema.lsp.impl;

import ac.polinema.lsp.entites.Tuk;
import ac.polinema.lsp.repositories.TukRepository;
import ac.polinema.lsp.services.TukServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TukImpl implements TukServices {

    @Autowired
    TukRepository tukRepository;

    @Override
    public List<Tuk> findAll() {
        return tukRepository.findAll();
    }

    @Override
    public Optional<Tuk> findById(String id) {
        return tukRepository.findById(id);
    }

    @Override
    public Tuk save(Tuk tuk) {
        return tukRepository.save(tuk);
    }

    @Override
    public Tuk update(String id, Tuk tuk) {
        tuk.get_id();
        return tukRepository.save(tuk);
    }

    @Override
    public void delete(String id) {
        tukRepository.deleteById(id);
    }
}
