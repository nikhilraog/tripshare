package com.github.tripville.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.Member;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Member, Long> {
	
	@Query("select m from Member m where m.userName = :userName")
	Member findByUserName(@Param("userName") String userName);
	
}
