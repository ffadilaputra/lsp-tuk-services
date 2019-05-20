package ac.polinema.lsp.repositories;

import ac.polinema.lsp.entites.Unit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnitRepository extends MongoRepository<Unit,String> {
}
