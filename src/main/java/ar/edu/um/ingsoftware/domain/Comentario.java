package ar.edu.um.ingsoftware.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * = Comentario
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Comentario {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String contenido;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToOne(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "comentario")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Usuario autor;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar timestmp;
}
