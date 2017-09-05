package de.springnodnet.model.wholesaler;

import java.util.Set;

import javax.persistence.Entity;

import de.springnodnet.model.BaseEntity;
import de.springnodnet.model.product.Product;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "wholesaler")
@AttributeOverride(name = "id", column = @Column(name = "wholesaler_id",
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class WholeSaler extends BaseEntity {

    private String wholesalerName;
    private String address;
    @OneToMany(mappedBy = "wholeSaler")
    private Set<Product> wholesalerProducts;

    public WholeSaler() {
    }

    public String getWholesalerName() {
        return wholesalerName;
    }

    public void setWholesalerName(String wholesalerName) {
        this.wholesalerName = wholesalerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Product> getWholesalerProducts() {
        return wholesalerProducts;
    }

    public void setWholesalerProducts(Set<Product> wholesalerProducts) {
        this.wholesalerProducts = wholesalerProducts;
    }

}
