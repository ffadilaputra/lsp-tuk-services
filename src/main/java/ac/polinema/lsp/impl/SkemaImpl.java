package ac.polinema.lsp.impl;

import ac.polinema.lsp.entites.Skema;
import ac.polinema.lsp.repositories.SkemaRepository;
import ac.polinema.lsp.services.SkemaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkemaImpl implements SkemaServices {

    @Autowired
    SkemaRepository skemaRepository;

    @Override
    public List<Skema> findAll() {
        return skemaRepository.findAll();
    }

    @Override
    public List<Skema> findSkemabyTuk(String id) {
        return null;
    }

    @Override
    public Optional<Skema> findById(String id) {
        return skemaRepository.findById(id);
    }

    @Override
    public Skema save(Skema skema) {
        return skemaRepository.save(skema);
    }

    @Override
    public Skema update(String id, Skema skema) {
        skema.get_id();
        return skemaRepository.save(skema);
    }

    @Override
    public void delete(String id) {
        skemaRepository.deleteById(id);
    }
}
