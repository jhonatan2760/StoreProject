package com.labs.jhonatansouza.gameStore.service;

import com.labs.jhonatansouza.gameStore.model.Product;
import com.labs.jhonatansouza.gameStore.repo.ProductRepository;
import com.labs.jhonatansouza.gameStore.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public ProductResponse insert(Product p){
        return new ProductResponse().fromModel(this.repository.save(p));
    }

    public List<Product> listProducts(){
        return this.repository.findAll();
    }

}
