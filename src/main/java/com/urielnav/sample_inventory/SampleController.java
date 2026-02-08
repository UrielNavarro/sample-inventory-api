package com.urielnav.sample_inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/samples") // Todas las rutas empezarán con esto
@CrossOrigin(origins = "*")
public class SampleController {

    @Autowired
    private SampleRepository sampleRepository;

    // 1. Obtener todos los samples
    @GetMapping
    public List<Sample> getAllSamples() {
        return sampleRepository.findAll();
    }

    // 2. Guardar un nuevo sample
    @PostMapping
    public Sample createSample(@RequestBody Sample sample) {
        return sampleRepository.save(sample);
    }

    // 3. Obtener uno por ID
    @GetMapping("/{id}")
    public Sample getSampleById(@PathVariable Long id) {
        return sampleRepository.findById(id).orElse(null);
    }

    // 4. Borrar un sample
    @DeleteMapping("/{id}")
    public void deleteSample(@PathVariable Long id) {
        sampleRepository.deleteById(id);
    }
}