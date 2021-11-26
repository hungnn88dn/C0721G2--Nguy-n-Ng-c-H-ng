package exercise.flower.repository;

import exercise.flower.model.Flower;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlowerRipository  extends PagingAndSortingRepository<Flower, Long> {
}
