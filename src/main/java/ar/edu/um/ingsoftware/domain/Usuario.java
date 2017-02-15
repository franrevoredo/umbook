package ar.edu.um.ingsoftware.domain;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import ar.edu.um.ingsoftware.reference.Persona;

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
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "autor")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private List<Comentario> comentariosHechos = new ArrayList<Comentario>();
}
