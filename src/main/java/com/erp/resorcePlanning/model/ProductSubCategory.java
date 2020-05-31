package com.erp.resorcePlanning.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class ProductSubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prod_sub_cat_id;

    private String name;
    private String Description;

    @ManyToOne
    @JoinColumn(name="prod_cat_id", nullable = false)
    private Collection<ProductCategory> productCategories;

    @OneToMany(mappedBy = "prodCategory")
    private Collection<Product> product;

    public ProductSubCategory(){}

    public ProductSubCategory(String name, String description) {
        this.name = name;
        Description = description;
    }

    public ProductSubCategory(String name, String description, Collection<ProductCategory> productCategories) {
        this.name = name;
        Description = description;
        this.productCategories = productCategories;
    }

    public Long getId() {
        return prod_sub_cat_id;
    }

    public void setId(Long id) {
        this.prod_sub_cat_id = prod_sub_cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Collection<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Collection<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    @Override
    public String toString() {
        return "ProductSubCategory{" +
                "prod_sub_cat_id=" + prod_sub_cat_id +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", productCategories=" + productCategories +
                '}';
    }
}
