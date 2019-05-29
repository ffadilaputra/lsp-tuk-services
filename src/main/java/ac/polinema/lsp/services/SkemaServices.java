package ac.polinema.lsp.services;

import ac.polinema.lsp.entites.Skema;

import java.util.List;
import java.util.Optional;

public interface SkemaServices {
    List<Skema> findAll();
    List<Skema> findSkemabyTuk(String id);
    Optional<Skema> findById(String id);
    Skema save(Skema skema);
    Skema update(String id,Skema skema);
    void delete(String id);
}
