package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Region;
import com.oceanguardians.oceanguard.repository.RegionRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{

    private final RegionRepository regionRepository;

    public Region buscarPorIdRegion(long regionID){
        return regionRepository.findByRegionId(regionID);
    }

}
