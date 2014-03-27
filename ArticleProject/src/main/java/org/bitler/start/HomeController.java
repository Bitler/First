package org.bitler.start;


import javax.servlet.http.HttpServletRequest;

import org.bitler.db.ProductDAO;
import org.bitler.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ProductDAO productDao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {		
		
		model.addAttribute("products", productDao.getProduct());
		
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)  
	public String add(HttpServletRequest req) {  
			
		Product product= new Product();
			product.setProductName(req.getParameter("productName"));
			product.setProductBarcode(Integer.parseInt(req.getParameter("productBarcode")));					
			
			productDao.addProduct(product);
			
		return "redirect:/"; 
	    }  
	      
	  
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)  
	public String redirect() {  
	
		return "redirect:addProduct";  
	    }  
	      
	 @RequestMapping(value = "/addProduct", method = RequestMethod.GET)  
	 public String addProduct() {  
	  
	    	return "addProduct";  
	   } 
	
}
