package br.com.gubee.infra.persistence.repositories;

import br.com.gubee.infra.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InMemoryRepository extends JpaRepository<Long, ProductEntity> {
}
