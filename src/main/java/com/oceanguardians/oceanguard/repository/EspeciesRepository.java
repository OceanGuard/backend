package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Especies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspeciesRepository extends JpaRepository<Especies, Long>{
}