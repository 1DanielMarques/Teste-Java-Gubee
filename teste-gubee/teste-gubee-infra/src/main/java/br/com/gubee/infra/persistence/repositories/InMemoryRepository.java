package br.com.gubee.infra.persistence.repositories;

import br.com.gubee.infra.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemoryRepository extends JpaRepository<ProductEntity, Long> {
}
