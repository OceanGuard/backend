package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByNombreRegion(String nombreRegion);

    //INTEGRAR QUERY QUE MUESTRE TODAS LAS ESPECIES EN UN TERRITORIO
}
