package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByNombreRegion(String nombreRegion);

    //INTEGRAR QUERY QUE MUESTRE TODAS LAS ESPECIES EN UN TERRITORIO
    @Query("SELECT e FROM Especies e JOIN e.regiones r WHERE r.nombreRegion = ?1")
    List<Especies> findEspeciesByNombreRegion(String nombreRegion);

}
