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
public class NewController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value ="/new", method = RequestMethod.GET)
    public String showAddPage(ModelMap map){
        return "new";
    }

    @ModelAttribute("nProduct")
    public Product productToAdd(){
        return new Product();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("nProduct") @Valid Product nProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "new";
        }
        dao.save(nProduct);
        return "redirect:/index";
    }
}
