package ac.polinema.lsp.services;

import ac.polinema.lsp.entites.Kuk;
import ac.polinema.lsp.entites.Skema;

import java.util.List;
import java.util.Optional;

public interface KukServices {
    List<Kuk> findAll();
    Optional<Kuk> findById(String id);
    Kuk save(Kuk kuk);
    Kuk update(String id,Kuk kuk);
    void delete(String id);
}
