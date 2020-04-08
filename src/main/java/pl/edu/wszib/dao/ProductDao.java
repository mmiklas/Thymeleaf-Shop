package pl.edu.wszib.dao;

import org.springframework.data.repository.CrudRepository;
import pl.edu.wszib.domain.Product;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Long> {
    //w przypadku korzystania z CrudRepository
    //nie ma potrzeby deklarować tutaj metod i implementować w ./impl/ProductDaoImpl.class
    //./impl/ProductDaoImpl.class - do usunięcia
}
