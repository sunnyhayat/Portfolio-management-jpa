package com.example.demo.entities;
// Security entity
import javax.persistence.*;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String securityName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "security")
    private List<PortfolioSecurity> portfolioSecurities;

    public Security() {}

    public Security(String securityName, Category category, List<PortfolioSecurity> portfolioSecurities) {
        this.securityName = securityName;
        this.category = category;
        this.portfolioSecurities = portfolioSecurities;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<PortfolioSecurity> getPortfolioSecurities() {
        return portfolioSecurities;
    }

    public void setPortfolioSecurities(List<PortfolioSecurity> portfolioSecurities) {
        this.portfolioSecurities = portfolioSecurities;
    }
}