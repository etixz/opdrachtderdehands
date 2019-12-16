package eb.egonb.opdrachtderdehands.controllers;

import eb.egonb.opdrachtderdehands.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DetailsController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value= "/details/{id}", method = RequestMethod.GET)
    public String giveDetailsProduct(ModelMap map, @PathVariable(value="id") int id){
    if(dao.findById(id).isPresent()){
        map.addAttribute("product", dao.findById(id).get());
        return "details";
    }
    else {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Dit product id bestaat niet!");
    }
    }
}
