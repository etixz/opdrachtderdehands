package eb.egonb.opdrachtderdehands.controllers;

import eb.egonb.opdrachtderdehands.model.Product;
import eb.egonb.opdrachtderdehands.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class IndexController {

    @Autowired
    ProductDAO dao;

    @ModelAttribute("allProducts")
    public Iterable<Product> showAllProducts(){
        return dao.findAll();
    }

    @RequestMapping(value={"","/","/index"}, method = RequestMethod.GET)
    public String showProducten(ModelMap map){
        return "index";
    }

}
