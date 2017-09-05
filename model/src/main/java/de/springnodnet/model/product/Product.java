package de.springnodnet.model.product;

import java.util.Map;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

import org.springframework.data.elasticsearch.annotations.Document;

import de.springnodnet.model.BaseEntity;
import de.springnodnet.model.wholesaler.WholeSaler;

@Entity
@Table(name = "Products")
@AttributeOverride(name = "id", column = @Column(name = "Product_id",
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
@Document(indexName = "productSearchIndex", type = "products")
public class Product extends BaseEntity {

    private String productName;
    private String productDescription;
    private Map<Map<String, String>, Map<String, Object>> properties;
    @ManyToOne
    private WholeSaler wholeSaler;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProperties(Map<Map<String, String>, Map<String, Object>> properties) {
        this.properties = properties;
    }

    public Map<Map<String, String>, Map<String, Object>> getProperties() {
        return properties;
    }

}
