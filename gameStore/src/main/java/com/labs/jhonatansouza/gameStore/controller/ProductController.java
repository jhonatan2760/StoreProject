package com.labs.jhonatansouza.gameStore.controller;


import com.labs.jhonatansouza.gameStore.model.Product;
import com.labs.jhonatansouza.gameStore.request.ProductRequest;
import com.labs.jhonatansouza.gameStore.response.ProductResponse;
import com.labs.jhonatansouza.gameStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController() {
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ProductResponse insertProduct(@RequestBody @Valid  ProductRequest productRequest){
        return this.productService.insert(productRequest.toModel());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ProductResponse> listProducts(){

        return this.productService.listProducts()
                .stream()
                .map(product -> new ProductResponse().fromModel(product))
                .collect(Collectors.toList());

    }
}
