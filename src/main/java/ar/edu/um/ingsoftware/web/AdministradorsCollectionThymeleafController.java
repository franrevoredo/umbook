package ar.edu.um.ingsoftware.web;
import ar.edu.um.ingsoftware.domain.Administrador;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AdministradorsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Administrador.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class AdministradorsCollectionThymeleafController {
}
