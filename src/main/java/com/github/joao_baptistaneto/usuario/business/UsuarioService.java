package com.github.joao_baptistaneto.usuario.business;

import com.github.joao_baptistaneto.usuario.business.converter.UsuarioConverter;
import com.github.joao_baptistaneto.usuario.business.dto.UsuarioDTO;
import com.github.joao_baptistaneto.usuario.infrastructure.entity.Usuario;
import com.github.joao_baptistaneto.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuario = usuarioRepository.save(usuario));
    }

}
