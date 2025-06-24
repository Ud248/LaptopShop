package vn.hoidanit.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.hoidanit.laptopshop.domain.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ProductController {

    @GetMapping("/admin/product")
    public String getProduct() {
        return "admin/product/show";
    }

    @GetMapping("/admin/product/create") // GET
    public String getCreateProductPage(Model model) {
        model.addAttribute("newProduct", new Product());
        return "admin/product/create";
    }

    @PostMapping("admin/product/create") 
    public String handleCreateProduct(
        @ModelAttribute("newProduct") @Valid Product pr,
    ) {
        //TODO: process POST request
        
        return entity;
    }
    
}
