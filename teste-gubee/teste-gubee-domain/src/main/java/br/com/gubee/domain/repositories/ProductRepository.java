package br.com.gubee.domain.repositories;

import br.com.gubee.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    List<Product> findAll();
}
