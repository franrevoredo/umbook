package ar.edu.um.ingsoftware.web;
import ar.edu.um.ingsoftware.domain.Administrador;
import ar.edu.um.ingsoftware.service.api.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AdministradorDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Administrador.class)
public class AdministradorDeserializer extends JsonObjectDeserializer<Administrador> {

    /**
     * TODO Auto-generated field documentation
     *
     */
    public AdministradorService administradorService;

    /**
     * TODO Auto-generated field documentation
     *
     */
    public ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param administradorService
     * @param conversionService
     */
    @Autowired
    public AdministradorDeserializer(AdministradorService administradorService, ConversionService conversionService) {
        this.administradorService = administradorService;
        this.conversionService = conversionService;
    }
}
