package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Investment {

    @Id
    @GeneratedValue
    private long investmentId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Investment() {
    }

    public Investment(String type, double amount, Portfolio portfolio) {
        this.type = type;
        this.amount = amount;
        this.portfolio = portfolio;
    }

    public Long getInvestmentId() {
        return investmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
