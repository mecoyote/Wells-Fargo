package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Client {@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long clientId;
    private String Firstname;
    private String lastName;
    private String address;

    private String phone;
    private String email;
    protected Client() {

    }

    public Client(String Firstname, String lastName, String address, String phone, String email) {
        this.Firstname = Firstname ;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstName(String FirstName) {
        this.Firstname = Firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @ManyToOne
    private Advisor Advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    // Constructors, getters, and setters

}
