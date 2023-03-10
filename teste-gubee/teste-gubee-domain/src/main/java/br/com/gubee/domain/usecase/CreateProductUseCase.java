package br.com.gubee.domain.usecase;

import br.com.gubee.domain.model.Product;
import br.com.gubee.domain.repositories.ProductRepository;
import br.com.gubee.domain.usecase.interfaces.CreateProduct;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateProductUseCase implements CreateProduct {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
