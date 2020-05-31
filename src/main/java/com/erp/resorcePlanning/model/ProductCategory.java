package com.erp.resorcePlanning.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prod_cat_id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "prodCategory")
    private Collection<ProductSubCategory> prodSubCategory;

    public ProductCategory(){}

    public ProductCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return prod_cat_id;
    }

    public void setId(Long id) {
        this.prod_cat_id = prod_cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "prod_cat_id=" + prod_cat_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
