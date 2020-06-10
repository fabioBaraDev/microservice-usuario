package nossagrana.usuario.service;

import nossagrana.usuario.dto.LogarUsuarioDTO;
import nossagrana.usuario.dto.UsuarioDTO;
import nossagrana.usuario.dto.UsuarioLogadoDTO;

public interface UsuarioService {
    UsuarioLogadoDTO autenticar(LogarUsuarioDTO usuario);

    UsuarioLogadoDTO create(UsuarioDTO usuario);

    UsuarioLogadoDTO update(UsuarioDTO usuario);

    void deactivate(UsuarioDTO usuario);
}
