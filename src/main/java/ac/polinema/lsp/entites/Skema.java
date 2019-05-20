package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Skema {

    @Id
    private String id_skema;

    private String kode_unit;

    private String judul_unit;

}
