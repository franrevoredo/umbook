package ar.edu.um.ingsoftware.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import ar.edu.um.ingsoftware.domain.Usuario;

/**
 * = UsuarioRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = UsuarioRepositoryCustom.class)
public class UsuarioRepositoryImpl extends QueryDslRepositorySupportExt<Usuario> {

    /**
     * TODO Auto-generated constructor documentation
     */
    UsuarioRepositoryImpl() {
        super(Usuario.class);
    }
}