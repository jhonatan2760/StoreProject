package com.labs.jhonatansouza.gameStore.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "detail_seq", sequenceName = "deta_seq", initialValue = 1, allocationSize = 1)
public class Detail {

    private Long id;
    private String description;
    private String image;
    private Product product;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detail_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
