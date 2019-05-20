package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
public class Tuk {

    @Id
    private String id_tuk;

    private String nama;

}
