package com.labs.jhonatansouza.gameStore.repo;

import com.labs.jhonatansouza.gameStore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
