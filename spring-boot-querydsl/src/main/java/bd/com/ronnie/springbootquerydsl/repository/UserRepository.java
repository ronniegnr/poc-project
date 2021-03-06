package bd.com.ronnie.springbootquerydsl.repository;

import bd.com.ronnie.springbootquerydsl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

}
