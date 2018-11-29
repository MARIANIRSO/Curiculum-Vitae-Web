package Controller;

import Modelos.Persona;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class FormController {

    @RequestMapping(value = "contacto.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("contacto", "command", new Persona());
    }

    @RequestMapping(value = "contacto.htm", method = RequestMethod.POST)
    public String form(Persona persona, ModelMap model) {
        model.addAttribute("nombre", persona.getNombre());
        model.addAttribute("apellido", persona.getApellido());
        model.addAttribute("correo", persona.getCorreo());
        model.addAttribute("mensaje", persona.getMensaje());
        return "form";

    }

}
