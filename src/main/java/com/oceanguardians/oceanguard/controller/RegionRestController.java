package com.oceanguardians.oceanguard.controller;

import com.oceanguardians.oceanguard.model.Region;
import com.oceanguardians.oceanguard.services.RegionServiceImpl;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/api/region")
public class RegionRestController {

    private final RegionServiceImpl regionService;

    @GetMapping("/region/{nombreRegion}")
    public ResponseEntity<Region> buscarPorNombreRegion(@RequestParam String nombreRegion){
        Region region = regionService.buscarPorNombreRegion(nombreRegion);
        return new ResponseEntity<>(region, HttpStatus.OK);
    }
}
