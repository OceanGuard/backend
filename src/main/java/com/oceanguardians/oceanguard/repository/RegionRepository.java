package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
