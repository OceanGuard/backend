package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.repository.VedaRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class VedaServiceImpl implements VedaService{

    private final VedaRepository vedaRepository;

}
