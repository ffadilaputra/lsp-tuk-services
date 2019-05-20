package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Unit {

    @Id
    private String id_unit;

    private String kode_unit;

    private String judul_unit;

    private String no_skema;

}
