package com.oceanguardians.oceanguard.repository;

import com.oceanguardians.oceanguard.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
