package com.solead.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solead.model.SavePlant;




@Repository
public interface SavePlantRepository extends JpaRepository<SavePlant, Long> {
	
	SavePlant save(List<SavePlant> saveplant);

	

}
