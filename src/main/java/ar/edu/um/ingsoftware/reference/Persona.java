package ar.edu.um.ingsoftware.reference;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;

/**
 * = Persona
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public abstract class Persona {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String username;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String password;
}
