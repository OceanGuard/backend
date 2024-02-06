package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Veda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VedaRepository extends JpaRepository<Veda, Long> {
}
