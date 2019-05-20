package ac.polinema.lsp.repositories;

import ac.polinema.lsp.entites.Kuk;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KukRepository extends MongoRepository<Kuk,String> {
}
