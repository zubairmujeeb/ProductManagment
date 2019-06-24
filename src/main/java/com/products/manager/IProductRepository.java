package com.products.manager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<product, Integer> {

}
