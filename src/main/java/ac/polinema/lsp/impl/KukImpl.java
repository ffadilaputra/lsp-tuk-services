package ac.polinema.lsp.impl;

import ac.polinema.lsp.entites.Kuk;
import ac.polinema.lsp.repositories.KukRepository;
import ac.polinema.lsp.services.KukServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KukImpl implements KukServices {

    @Autowired
    KukRepository kukRepository;

    @Override
    public List<Kuk> findAll() {
        return kukRepository.findAll();
    }

    @Override
    public Optional<Kuk> findById(String id) {
        return kukRepository.findById(id);
    }

    @Override
    public Kuk save(Kuk kuk) {
        return kukRepository.save(kuk);
    }

    @Override
    public Kuk update(String id, Kuk kuk) {
        kuk.get_id();
        return kukRepository.save(kuk);
    }

    @Override
    public void delete(String id) {
        kukRepository.deleteById(id);
    }
}
