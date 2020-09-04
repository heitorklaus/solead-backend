package com.buracosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buracosapp.model.Comments;
 




@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
	

}
