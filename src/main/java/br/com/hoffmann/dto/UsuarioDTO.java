package br.com.hoffmann.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO implements Serializable {

    private String login;
    private String senha;
    private String criadoPor;
    private LocalDateTime dataCadastro;

}
