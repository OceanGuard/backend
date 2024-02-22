package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Region;
import com.oceanguardians.oceanguard.repository.RegionRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@Transactional
public class RegionServiceImpl implements RegionService{

    private final RegionRepository regionRepository;

    @Autowired
    public RegionServiceImpl(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }
    @Override
    public Region buscarRegionPorNombre(String nombreRegion) {
        return regionRepository.findByNombreRegion(nombreRegion);
    }

    @Override
    public List<Region> listarRegiones() {
        return regionRepository.findAll();
    }

    @Override
    public void eliminarRegionPorId(Long id) {
        regionRepository.deleteById(id);
    }

}
