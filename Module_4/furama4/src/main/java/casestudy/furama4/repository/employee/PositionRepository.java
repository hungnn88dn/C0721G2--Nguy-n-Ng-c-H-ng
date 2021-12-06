package casestudy.furama4.repository.employee;

import casestudy.furama4.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
