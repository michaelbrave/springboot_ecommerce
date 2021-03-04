package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/product/{id}")
	public String show(@PathVariable int id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute(product);
		return "product";
	}

}
