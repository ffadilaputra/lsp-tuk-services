package ac.polinema.lsp.services;

import ac.polinema.lsp.entites.Tuk;

import java.util.List;
import java.util.Optional;

public interface TukServices {
    List<Tuk> findAll();
    Optional<Tuk> findById(String id);
    Tuk save(Tuk tuk);
    Tuk update(String id,Tuk tuk);
    void delete(String id);
}
