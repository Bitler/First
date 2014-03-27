package org.bitler.start;


import javax.servlet.http.HttpServletRequest;

import org.bitler.db.ArticleDAO;
import org.bitler.entity.Article;
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
	private ArticleDAO articleDao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {		
		
		model.addAttribute("articles", articleDao.getArticle());
		
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)  
	public String add(HttpServletRequest req) {  
			
		Article article= new Article();
			article.setArticleName(req.getParameter("articleName"));
			article.setArticleBarcode(Integer.parseInt(req.getParameter("articleBarcode")));					
			
			articleDao.addArticle(article);
			
		return "redirect:/"; 
	    }  
	      
	  
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)  
	public String redirect() {  
	
		return "redirect:addArticle";  
	    }  
	      
	 @RequestMapping(value = "/addArticle", method = RequestMethod.GET)  
	 public String addArticle() {  
	  
	    	return "addArticle";  
	   } 
	
}
