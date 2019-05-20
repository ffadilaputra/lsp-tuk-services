package ac.polinema.lsp.services;

import ac.polinema.lsp.entites.Elemen;

import java.util.List;
import java.util.Optional;

public interface ElemenServices {
    List<Elemen> findAll();
    Optional<Elemen> findById(String id);
    Elemen save(Elemen elemen);
    Elemen update(String id,Elemen elemen);
    void delete(String id);
}
