package ar.edu.um.ingsoftware.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import ar.edu.um.ingsoftware.domain.Administrador;

/**
 * = AdministradorRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = AdministradorRepositoryCustom.class)
public class AdministradorRepositoryImpl extends QueryDslRepositorySupportExt<Administrador> {

    /**
     * TODO Auto-generated constructor documentation
     */
    AdministradorRepositoryImpl() {
        super(Administrador.class);
    }
}