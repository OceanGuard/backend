package com.oceanguardians.oceanguard.controller;

import com.oceanguardians.oceanguard.model.Especies;
import com.oceanguardians.oceanguard.model.Veda;
import com.oceanguardians.oceanguard.services.VedaServiceImpl;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/api/veda")
public class VedaRestController {

    private final VedaServiceImpl vedaService;

    @GetMapping("/veda/{nombreEspecie}")
    public ResponseEntity<List<Veda>> buscarPorNombreEspecie(@PathVariable String nombreEspecie) {
        List<Veda> vedas = vedaService.buscarPorNombreEspecie(nombreEspecie);
        return new ResponseEntity<>(vedas, HttpStatus.OK);

    }


}
