package com.erp.resorcePlanning.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Product {

    @Id
    @GeneratedValue(generator =  "UUID")
    private Long prod_id;

    private String name;
    private String description;
    private Double pricePerUnit;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name="prod_sub_cat_id", nullable = false)
    private Collection<ProductSubCategory> prodSubCategory;

    private Collection<ProductCategory> prodCategory;

    public Product(){}

    public Product(String name, String description, Double pricePerUnit, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.description = description;
        this.pricePerUnit = pricePerUnit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product(String name, String description, Double pricePerUnit, Timestamp createdAt, Timestamp updatedAt, Collection<ProductSubCategory> prodSubCategory, Collection<ProductCategory> prodCategory) {
        this.name = name;
        this.description = description;
        this.pricePerUnit = pricePerUnit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prodSubCategory = prodSubCategory;
        this.prodCategory = prodCategory;
    }

    public Long getId() {
        return prod_id;
    }

    public void setId(Long id) {
        this.prod_id = prod_id;
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

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Collection<ProductSubCategory> getProdSubCategory() {
        return prodSubCategory;
    }

    public void setProdSubCategory(Collection<ProductSubCategory> prodSubCategory) {
        this.prodSubCategory = prodSubCategory;
    }

    public Collection<ProductCategory> getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(Collection<ProductCategory> prodCategory) {
        this.prodCategory = prodCategory;
    }


    @Override
    public String toString() {
        return "Product{" +
                "prod_id=" + prod_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", prodSubCategory=" + prodSubCategory +
                ", prodCategory=" + prodCategory +
                '}';
    }
}
