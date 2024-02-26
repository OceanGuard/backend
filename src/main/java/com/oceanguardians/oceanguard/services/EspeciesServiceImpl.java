package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.repository.EspeciesRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class EspeciesServiceImpl implements EspeciesService{

    private final EspeciesRepository especiesRepository;

    @Override
    public List<Especies> buscarEspeciesPorRegion(int idRegion){
        return especiesRepository.findByRegionEnVeda(idRegion);
    }

}
