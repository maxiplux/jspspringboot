package sprigbootjsp.demo;

/**
 * User: franc
 * Date: 20/09/2018
 * Time: 11:25
 */



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerJsp {






    @RequestMapping(value = "/pruebas", method = RequestMethod.GET)
    public String cars() {

        return "index";
    }
}

