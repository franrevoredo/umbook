package ar.edu.um.ingsoftware.domain;
import java.util.Calendar;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

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
    /**
     * TODO Auto-generated field documentation
     *
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar timestmp;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario autor;
}
