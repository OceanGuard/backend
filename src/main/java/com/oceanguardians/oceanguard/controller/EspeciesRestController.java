package com.oceanguardians.oceanguard.controller;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.services.EspeciesServiceImpl;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/api/especies")
public class EspeciesRestController {

    private final EspeciesServiceImpl especiesService;

    @GetMapping("/especies/{idRegion}")
    public ResponseEntity<List<Especies>> buscarEspeciesPorRegion(@PathVariable int idRegion) {
        List<Especies> especies = especiesService.buscarEspeciesPorRegion(idRegion);
        return new ResponseEntity<>(especies, HttpStatus.OK);
    }
}
