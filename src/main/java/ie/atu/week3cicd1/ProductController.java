package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }

    @GetMapping("/getproducts")
    public List<Product> getProduct()
    {
        Product myProduct = new Product("Tv", 499);
        return myList;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }
}
