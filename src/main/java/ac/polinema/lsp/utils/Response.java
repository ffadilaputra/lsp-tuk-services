package ac.polinema.lsp.utils;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response<T> {

    private String service;
    private String message;
    private T data;

}
