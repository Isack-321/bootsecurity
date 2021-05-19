package com.izoo.bootsecurity;

import com.izoo.bootsecurity.Model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDetail,Integer> {
    Optional<UserDetail> findByUserName(String userName);
}
