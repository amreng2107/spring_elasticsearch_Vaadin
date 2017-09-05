package de.springnodnet.business.productservice;

import de.springnodnet.repository.ProductRepository;
import de.springnodnet.model.product.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class ProductServicesImpl implements ProductServices {

    private ProductRepository productRepo;

    @Autowired
    public void setProductRepository(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product save(Product p) {
        return productRepo.save(p);
    }

    public void delete(Product p) {
        productRepo.delete(p);
    }

    public Product findOne(Long id) {
        return productRepo.findOne(id);
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public Page<Product> findByName(String name, PageRequest pageRequest) {
        return productRepo.findByName(name, pageRequest);
    }

    public List<Product> findByDescription(String des) {
        return productRepo.findByDescription(des);
    }
}
