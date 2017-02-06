package ar.edu.um.ingsoftware.domain;
import ar.edu.um.ingsoftware.reference.Persona;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 * = Usuario
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Usuario extends Persona {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String email;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String nombre;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String apellido;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar fechaNacimiento;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToOne(fetch = FetchType.LAZY)
    private Comentario comentario;
}
