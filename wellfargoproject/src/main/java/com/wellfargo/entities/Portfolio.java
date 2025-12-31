package com.example.demo.entities;
//Prtfolio entity
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private LocalDate createdDate;

    private Double totalValue;

    @OneToMany(mappedBy = "portfolio")
    private List<PortfolioSecurity> portfolioSecurities;

    public Portfolio() {}

    public Portfolio(Client client, LocalDate createdDate, Double totalValue, List<PortfolioSecurity> portfolioSecurities) {
        this.client = client;
        this.createdDate = createdDate;
        this.totalValue = totalValue;
        this.portfolioSecurities = portfolioSecurities;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<PortfolioSecurity> getPortfolioSecurities() {
        return portfolioSecurities;
    }

    public void setPortfolioSecurities(List<PortfolioSecurity> portfolioSecurities) {
        this.portfolioSecurities = portfolioSecurities;
    }
}