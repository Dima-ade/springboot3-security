package ro.adela.springboot3security.repository;

import org.springframework.stereotype.Repository;
import ro.adela.springboot3security.entity.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.adela.springboot3security.service.UserInfoDetails;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String email); // Use 'email' if that is the correct field for login
}