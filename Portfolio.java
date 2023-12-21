package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long portfolioId;
    protected Portfolio() {

    }



    public Long getPortfolioId() {
        return portfolioId;
    }

    @OneToOne
    private Client client;

    // Constructors, getters, and setters
}
