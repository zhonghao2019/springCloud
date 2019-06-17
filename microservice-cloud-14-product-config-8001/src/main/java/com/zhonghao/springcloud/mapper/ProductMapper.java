package com.zhonghao.springcloud.mapper;

import com.zhonghao.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
