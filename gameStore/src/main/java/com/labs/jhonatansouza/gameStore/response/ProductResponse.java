package com.labs.jhonatansouza.gameStore.response;

import com.labs.jhonatansouza.gameStore.model.Product;
import com.labs.jhonatansouza.gameStore.request.ProductRequest;

public class ProductResponse {

    private Long id;
    private String name;
    private int launchYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public ProductResponse fromModel(Product p){
        this.id = p.getId();
        this.name = p.getName();
        this.launchYear = p.getLaunchYear();
        return this;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }
}
