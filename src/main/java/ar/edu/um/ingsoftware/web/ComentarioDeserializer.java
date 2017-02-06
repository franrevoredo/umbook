package ar.edu.um.ingsoftware.web;
import ar.edu.um.ingsoftware.domain.Comentario;
import ar.edu.um.ingsoftware.service.api.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ComentarioDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Comentario.class)
public class ComentarioDeserializer extends JsonObjectDeserializer<Comentario> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ComentarioService comentarioService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param comentarioService
     * @param conversionService
     */
    @Autowired
    public ComentarioDeserializer(ComentarioService comentarioService, ConversionService conversionService) {
        this.comentarioService = comentarioService;
        this.conversionService = conversionService;
    }
}
