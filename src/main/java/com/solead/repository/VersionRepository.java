package com.solead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.solead.model.Cash;
import com.solead.model.Version;
 




@Repository
public interface VersionRepository extends JpaRepository<Version, Long> {
	 
}
