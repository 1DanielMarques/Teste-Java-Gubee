package br.com.gubee.domain.usecase.interfaces;

import br.com.gubee.domain.model.Product;

import java.util.List;

public interface FindProduct {

    List<Product> findAll();

}
