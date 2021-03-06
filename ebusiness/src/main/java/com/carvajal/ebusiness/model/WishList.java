package com.carvajal.ebusiness.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wishlist")
//@IdClass(value = WishList.class)
public class WishList implements Serializable{
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wl_id")
    private long id;

    /*@Id
    @Column(name = "wl_client")
    //@ManyToOne
    //@JoinColumn(name = "cliDocument", referencedColumnName = "cli_id")
    private long cliDocument;

    @Id
    @Column(name = "wl_product")
    //@ManyToOne
    //@JoinColumn(name = "proId", referencedColumnName = "pro_id")
    private int proId;*/

    @Column(name = "wl_createdate")
    private LocalDateTime createDate;

    @Column(name = "wl_updatedate")
    private LocalDateTime updateDate;

    @Column(name = "wl_quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "wl_client", referencedColumnName = "cli_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "wl_product", referencedColumnName = "pro_id")
    private Product product;

    @Column(name = "wl_state")
    private String state;

    public WishList() {

    }

    public WishList(long id, LocalDateTime createDate, LocalDateTime updateDate, int quantity, Client client,
            Product product, String state) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.quantity = quantity;
        this.client = client;
        this.product = product;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "WishList [client=" + client + ", createDate=" + createDate + ", id=" + id + ", product=" + product
                + ", quantity=" + quantity + ", state=" + state + ", updateDate=" + updateDate + "]";
    }

}
