package com.labs.jhonatansouza.gameStore.request;

import com.labs.jhonatansouza.gameStore.model.Product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ProductRequest {

    @NotNull(message = "The name must be valid!")
    private String name;
    @Min(value = 1973, message = "The value must be great than {value} ")
    private int launchYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public Product toModel(){
        Product p = new Product();
        p.setName(this.name);
        p.setLaunchYear(this.launchYear);
        return p;
    }
}
