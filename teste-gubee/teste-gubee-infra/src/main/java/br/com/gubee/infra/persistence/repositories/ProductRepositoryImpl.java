package br.com.gubee.infra.persistence.repositories;

import br.com.gubee.domain.model.Product;
import br.com.gubee.domain.repositories.ProductRepository;
import br.com.gubee.infra.persistence.entities.ProductEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final InMemoryRepository repository;

    @Override
    public Product save(Product product) {
        ProductEntity entity = repository.save(ProductEntity.builder()
                .productName(product.getProductName())
                .description(product.getDescription())
                .targetMarket(product.getTargetMarket())
                .stack(product.getStack()).build());
        return Product.builder()
                .productName(entity.getProductName())
                .description(entity.getDescription())
                .targetMarket(entity.getTargetMarket())
                .stack(entity.getStack()).build();
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
