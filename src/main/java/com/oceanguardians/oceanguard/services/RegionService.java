package com.oceanguardians.oceanguard.services;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.model.Region;

import java.util.List;

public interface RegionService {

    Region buscarPorIdRegion(long regionId);

    List<Region> getAllEntities();
}
