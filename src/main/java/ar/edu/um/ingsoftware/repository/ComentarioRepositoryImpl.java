package ar.edu.um.ingsoftware.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import ar.edu.um.ingsoftware.domain.Comentario;

/**
 * = ComentarioRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = ComentarioRepositoryCustom.class)
public class ComentarioRepositoryImpl extends QueryDslRepositorySupportExt<Comentario> {

    /**
     * TODO Auto-generated constructor documentation
     */
    ComentarioRepositoryImpl() {
        super(Comentario.class);
    }
}