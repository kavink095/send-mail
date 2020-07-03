package com.example.mail.mailsend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.mail.mailsend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	@Query(value = "SELECT gn_Number FROM user_Entity u WHERE u.active_Status = 0 AND u.gn_Number", nativeQuery =  true)
	String findUserByStatusNative(Integer activeStatus,Integer number);
	
	@Modifying
	@Query(value = "UPDATE user_Entity u SET u.active_Status = 1 WHERE u.gn_Number = gn_Number",  nativeQuery =  true)
	int updateUserSetStatusForName(Integer activeStatus,Integer number);

}
