package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    List<Item> items2 = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(targetEntity = Item.class , mappedBy = "invoice" ,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Item> getItems() {
        return items2;
    }

    public void setItems(List<Item> items) {
        this.items2 = items2;
    }
}
