package ac.polinema.lsp.impl;
import ac.polinema.lsp.entites.Unit;
import ac.polinema.lsp.repositories.UnitRepository;
import ac.polinema.lsp.services.UnitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitImpl implements UnitServices {

    @Autowired
    UnitRepository unitRepository;

    @Override
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }

    @Override
    public Optional<Unit> findById(String id) {
        return unitRepository.findById(id);
    }

    @Override
    public Unit save(Unit unit) {
        return unitRepository.save(unit);
    }

    @Override
    public Unit update(String id, Unit unit) {
        unit.get_id();
        return unitRepository.save(unit);
    }

    @Override
    public void delete(String id) {

    }
}
