package com.conecta.Repository;

import com.conecta.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JOAO on 09/05/2019.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
