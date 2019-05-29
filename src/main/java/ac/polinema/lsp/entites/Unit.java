package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Unit {

    @Id
    private String _id;

    private String kode_unit;

    private String judul_unit;

    private String id_skema;
}
