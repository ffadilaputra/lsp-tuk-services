package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Skema {

    @Id
    private String _id;

    private String nama_skema;

    private String id_tuk;

}
