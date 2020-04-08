package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.dao.ProductDao;
import pl.edu.wszib.domain.Product;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class RestShopController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("products")
    public List<Product> products() {
        return (List)productDao.findAll();
    }

    @DeleteMapping("products/remove/{id}")
    public void removeProduct(@PathVariable Long id) {
        productDao.deleteById(id);
    }

    @PostMapping("products/save")
    public void saveProduct(@RequestBody Product product) {
        productDao.save(product);
    }

    @GetMapping("products/single/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productDao.findById(id).get();
    }

}
