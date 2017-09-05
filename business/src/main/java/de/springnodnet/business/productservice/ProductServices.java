
package de.springnodnet.business.productservice;

import de.springnodnet.model.product.Product;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ProductServices {
 
    Product save(Product p);

    void delete(Product p);

    Product findOne(Long id);

    Iterable<Product> findAll();

    Page<Product> findByName(String name, PageRequest pageRequest);

    List<Product> findByDescription(String des);
  
}
