package ar.edu.um.ingsoftware.web;
import ar.edu.um.ingsoftware.domain.Comentario;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ComentariosCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Comentario.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class ComentariosCollectionThymeleafController {
}
