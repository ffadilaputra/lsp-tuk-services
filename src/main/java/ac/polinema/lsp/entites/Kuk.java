package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Kuk {

    @Id
    private String id_kuk;

    private String pertanyaan;

    private String id_elemen;

}
