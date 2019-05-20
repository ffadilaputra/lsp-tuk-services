package ac.polinema.lsp.repositories;

import ac.polinema.lsp.entites.Elemen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ElemenRepository extends MongoRepository<Elemen, String> {
}
