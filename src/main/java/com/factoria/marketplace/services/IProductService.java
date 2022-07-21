package com.factoria.marketplace.services;

import com.factoria.marketplace.dto.ProductRequestDto;
import com.factoria.marketplace.models.Product;
import com.factoria.marketplace.models.User;

import java.util.List;

public interface IProductService {

    List<Product> getAll();

    Product create(ProductRequestDto productDto, User authUser);


    Product findById(Long id);
}

