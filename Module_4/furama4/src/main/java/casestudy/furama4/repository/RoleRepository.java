package casestudy.furama4.repository;

import casestudy.furama4.models.Role;
import casestudy.furama4.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
