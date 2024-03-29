package com.oceanguardians.oceanguard.controller;

import com.oceanguardians.oceanguard.model.Region;
import com.oceanguardians.oceanguard.services.RegionServiceImpl;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@Data
@RequestMapping("/api/region")
public class RegionRestController {

    private final RegionServiceImpl regionService;

    @GetMapping("/region/{regionId}")
    public ResponseEntity<Region> buscarPorNombreRegion(@PathVariable long regionId){
        Region region = regionService.buscarPorIdRegion(regionId);
        System.out.println("Received regionId: " + regionId);
        return new ResponseEntity<>(region, HttpStatus.OK);
    }

    @GetMapping("/regiones")
    public List<Region> getAllEntities() {
        return regionService.getAllEntities();
    }
}
