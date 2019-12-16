package eb.egonb.opdrachtderdehands.controllers;

import eb.egonb.opdrachtderdehands.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String showAboutPage(ModelMap map){
        return "about";
    }
}
