package exercise.blog.repository;

import exercise.blog.model.Ecommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEcommerceRepository extends JpaRepository<Ecommerce, Integer> {
}
