package ar.edu.um.ingsoftware.repository;
import ar.edu.um.ingsoftware.domain.Usuario;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooFinder;

/**
 * = UsuarioRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Usuario.class, finders = { @RooFinder("findByEmailEquals"), @RooFinder("findByNombreLike"), @RooFinder("findByApellidoLike") })
public interface UsuarioRepository {
}
