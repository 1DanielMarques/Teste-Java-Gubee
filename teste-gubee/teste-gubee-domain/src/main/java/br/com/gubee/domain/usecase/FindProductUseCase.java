package br.com.gubee.domain.usecase;

import br.com.gubee.domain.model.Product;
import br.com.gubee.domain.repositories.ProductRepository;
import br.com.gubee.domain.usecase.interfaces.FindProduct;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FindProductUseCase implements FindProduct {

    private final ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return null;
    }
}
