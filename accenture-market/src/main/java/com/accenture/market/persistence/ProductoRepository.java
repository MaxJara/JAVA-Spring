package com.accenture.market.persistence;

import com.accenture.market.persistence.crud.ProductoCrudRepository;
import com.accenture.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
