package com.cuatroa.retouno.repository.crud;

import com.cuatroa.retouno.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @Author David Beltran
 * @Group  03 G15
 * 
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
