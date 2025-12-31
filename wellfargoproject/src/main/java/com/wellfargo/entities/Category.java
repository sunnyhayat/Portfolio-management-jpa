package com.example.demo.entities;
// Category entity
import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryId;

    @Column(nullable = false)
    private String CategoryName;

    @OneToMany(mappedBy = "Category")
    private List<com.example.demo.entities.Security> securities;

    public Category() {}

    public Category(String categoryName, List<com.example.demo.entities.Security> securities) {
        this.CategoryName = categoryName;
        this.securities = securities;
    }

    public Long getCategoryId() {
        return CategoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = catagoryName;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}