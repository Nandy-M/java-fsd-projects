package com.SpringJDBC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringJDBC.dao.EproductDao;
import com.SpringJDBC.entity.EproductEntity;

@Controller
public class MainController {
	
	@Autowired    
    EproductDao eproductDAO;    
   @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
    public String listProducts(ModelMap map)
    {
            List<EproductEntity> list= eproductDAO.getProducts();
             map.addAttribute("list",list);  
             return "listProducts";
    } 
   }



