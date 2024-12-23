package productcrudapp.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
    
	
@Autowired
private ProductDao productDao;
    

    // Home page
    @RequestMapping("/")
    public String home(Model m) {
        System.out.println("Home page running");
        List<Product> products=productDao.getProducts();
        m.addAttribute("product",products);
        
        return "index";
    }

    // Add product page
    @RequestMapping("/addproduct")
    public String addProduct(Model model) {
        model.addAttribute("title", "Add Product Page");
        System.out.println("Product page running");
        return "addproduct";
    }

    // Handle add product form
    @RequestMapping(value = "/handel-product", method = RequestMethod.POST)
    public RedirectView handelProduct(@ModelAttribute("Product") Product product, HttpServletRequest request) {
        System.out.println("Product received:"+ product);
        productDao.createProduct(product);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/");
        return redirectView;
    }
    
    //delete handler
    @RequestMapping("/delete/{productId}")
    public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request) {
    	System.out.println("select for delete"+productId);
    	productDao.deleteProduct(productId);
        RedirectView redirectView = new RedirectView();
          redirectView.setUrl(request.getContextPath() + "/");
          return redirectView;
    	}
    
    @RequestMapping("/update/{productId}")//update chalega and then yha jo product pe click kiya vo id aa jayegi 
    public String updateForm(@PathVariable("productId") int pid,Model model) {//yha pe product id ko liya 
    	Product product=this.productDao.getProduct(pid); //vo vala product chahiye jo id pass ki hai ye list vala get product hai sare product isme hai
    	model.addAttribute("product",product);
    	return "update_form";
    }
    
}
