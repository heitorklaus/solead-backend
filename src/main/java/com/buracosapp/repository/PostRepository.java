package com.buracosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buracosapp.model.Post;




@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	

}
