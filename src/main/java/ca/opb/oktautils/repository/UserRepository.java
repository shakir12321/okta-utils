package ca.opb.oktautils.repository;

import ca.opb.oktautils.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}