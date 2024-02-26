package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Region;
import com.oceanguardians.oceanguard.model.Veda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VedaRepository extends JpaRepository<Veda, Long> {

    @Query("SELECT v FROM Veda v JOIN v.especieEnVeda e WHERE e.nombreEspecie = :nombreEspecies")
    List<Veda> findByNombreEspecie(@Param("nombreEspecie") String nombreEspecie);


}
