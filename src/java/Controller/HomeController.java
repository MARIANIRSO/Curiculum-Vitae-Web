package Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home.htm")
    public ModelAndView home(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("home");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

    @RequestMapping("catalogo.htm")
    public ModelAndView catalogo(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("catalogo");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

    @RequestMapping("contacto.htm")
    public ModelAndView contacto(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contacto");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

    @RequestMapping("juegosps2.htm")
    public ModelAndView juegosps2(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("juegosps2");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

    @RequestMapping("juegosps3.htm")
    public ModelAndView juegosps3(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("juegosps3");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

    @RequestMapping("juegosps4.htm")
    public ModelAndView juegosps4(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("juegosps4");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
        return mav;
    }

}
