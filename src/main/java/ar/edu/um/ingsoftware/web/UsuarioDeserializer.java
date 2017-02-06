package ar.edu.um.ingsoftware.web;
import ar.edu.um.ingsoftware.domain.Usuario;
import ar.edu.um.ingsoftware.service.api.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = UsuarioDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Usuario.class)
public class UsuarioDeserializer extends JsonObjectDeserializer<Usuario> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public UsuarioService usuarioService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param usuarioService
     * @param conversionService
     */
    @Autowired
    public UsuarioDeserializer(UsuarioService usuarioService, ConversionService conversionService) {
        this.usuarioService = usuarioService;
        this.conversionService = conversionService;
    }
}
