package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Veda;
import com.oceanguardians.oceanguard.repository.VedaRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class VedaServiceImpl implements VedaService{

    private final VedaRepository vedaRepository;

    @Override
    public List<Veda> buscarPorNombreEspecie(String nombreEspecie) {
        return vedaRepository.findByNombreEspecie(nombreEspecie);
    }
}
