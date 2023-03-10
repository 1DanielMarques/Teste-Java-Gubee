package br.com.gubee.infra.config;

import br.com.gubee.domain.repositories.ProductRepository;
import br.com.gubee.infra.persistence.repositories.InMemoryRepository;
import br.com.gubee.infra.persistence.repositories.ProductRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@RequiredArgsConstructor
@EnableJpaRepositories( basePackageClasses = InMemoryRepository.class)
@ComponentScan(basePackages = { "br.com.gubee.*" })
@EntityScan("br.com.gubee.infra.persistence.entities")
public class PersistenceContextConfiguration {

    private final InMemoryRepository inMemoryRepository;

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl(inMemoryRepository);
    }

}
