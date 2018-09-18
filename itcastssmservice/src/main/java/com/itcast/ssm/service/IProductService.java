package com.itcast.ssm.service;

import com.itcast.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll() throws Exception;
}
