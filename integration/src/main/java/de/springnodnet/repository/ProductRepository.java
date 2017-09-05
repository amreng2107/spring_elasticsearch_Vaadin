package de.springnodnet.repository;

import de.springnodnet.model.product.Product;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

@Repository
public interface ProductRepository extends ElasticsearchRepository< Product,Long> {
  Page<Product> findByName(String name,PageRequest pageRequest);
  List<Product> findByDescription(String des); 
}
