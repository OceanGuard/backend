package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Especies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspeciesRepository extends JpaRepository<Especies, Long>{

    @Query("SELECT e FROM Especies e JOIN Veda v ON e.especiesId = v.especieEnVeda WHERE v.regionDeVeda = :idRegion")
    List<Especies> findByRegionEnVeda(@Param("idRegion") long idRegion);

}