package com.products.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController 
{
	@Autowired
 private ProductService prod;
	
	@RequestMapping("/")
	public String ViewHomePage(Model model) 
	{
		
		List<product> all =prod.Allproducts();
		model.addAttribute("Products", all );
		
		
	  return "NewFile";	
	}
	
	
	@RequestMapping("/save")
	public String SaveProducts() 
	{
	  return "Saveform";	
	}
	
	@RequestMapping("/newrecord")
	public String SaveProductsPost(product p) 
	{
		prod.save(p);
		
	  return "redirect:/";	
	}
	
	@RequestMapping("/editform/{id}")
	public String showProductstoEdit(@PathVariable( name =  "id") int id,Model model) 
	{
		
		product getprod=prod.Getproductbyid(id);
		
		model.addAttribute("product", getprod );
		
	  return "Showform";	
	}
	
	@RequestMapping("/deleterecord/{id}")
	public String SaveProductsPost(@PathVariable( name =  "id") int id) 
	{
		prod.delete(id);
		
	  return "redirect:/";	
	}
	
	
	
	
	
	
	
}
