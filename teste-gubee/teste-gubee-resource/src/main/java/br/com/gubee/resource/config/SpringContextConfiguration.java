package br.com.gubee.resource.config;

import br.com.gubee.domain.repositories.ProductRepository;
import br.com.gubee.domain.usecase.CreateProductUseCase;
import br.com.gubee.domain.usecase.DeleteProductUseCase;
import br.com.gubee.domain.usecase.FindProductUseCase;
import br.com.gubee.domain.usecase.UpdateProductUseCase;
import br.com.gubee.domain.usecase.interfaces.CreateProduct;
import br.com.gubee.domain.usecase.interfaces.DeleteProduct;
import br.com.gubee.domain.usecase.interfaces.FindProduct;
import br.com.gubee.domain.usecase.interfaces.UpdateProduct;
import br.com.gubee.infra.config.PersistenceContextConfiguration;
import br.com.gubee.resource.assembler.ProductAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@RequiredArgsConstructor
@Import(PersistenceContextConfiguration.class)
public class SpringContextConfiguration {

    private final ProductRepository productRepository;

    @Bean
    public CreateProduct createProduct() {
        return new CreateProductUseCase(productRepository);
    }

    @Bean
    public FindProduct findProduct() {
        return new FindProductUseCase();
    }

    @Bean
    public UpdateProduct updateProduct() {
        return new UpdateProductUseCase();
    }

    @Bean
    public DeleteProduct deleteProduct() {
        return new DeleteProductUseCase();
    }

    @Bean
    public ProductAssembler productAssembler() {
        return new ProductAssembler();
    }


}

