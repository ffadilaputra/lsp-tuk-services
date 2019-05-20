package ac.polinema.lsp.services;
import ac.polinema.lsp.entites.Unit;

import java.util.List;
import java.util.Optional;

public interface UnitServices {
    List<Unit> findAll();
    Optional<Unit> findById(String id);
    Unit save(Unit unit);
    Unit update(String id,Unit unit);
    void delete(String id);
}
