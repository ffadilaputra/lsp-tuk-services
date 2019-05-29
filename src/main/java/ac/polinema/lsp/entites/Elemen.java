package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Elemen {

    @Id
    private String _id;

    private String judul_elemen;

    private String id_unit;

}
