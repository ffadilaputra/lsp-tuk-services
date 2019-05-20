package ac.polinema.lsp.repositories;

import ac.polinema.lsp.entites.Skema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkemaRepository extends MongoRepository<Skema,String> {
}
