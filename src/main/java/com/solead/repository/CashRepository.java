package com.solead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.solead.model.Cash;
 




@Repository
public interface CashRepository extends JpaRepository<Cash, Long> {
	
	@Query("select b from Cash b where b.usuario.id = :id")
	Cash findByReviewId(@Param("id") long id);

	

}
