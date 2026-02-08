package com.urielnav.sample_inventory.controller;

import com.urielnav.sample_inventory.model.SampleModel;
import com.urielnav.sample_inventory.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/samples")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping
    public List<SampleModel> obtenerSamples() {
        return sampleService.obtenerSamples();
    }

    @PostMapping
    public SampleModel guardarSample(@RequestBody SampleModel sample) {
        return sampleService.guardarSample(sample);
    }

    @GetMapping("/{id}")
    public Optional<SampleModel> obtenerSamplePorId(@PathVariable("id") Long id) {
        return sampleService.obtenerSamplePorId(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarSamplePorId(@PathVariable("id") Long id) {
        boolean ok = sampleService.eliminarSamplePorId(id);
        if (ok) {
            return "Se eliminó el sample con id " + id + " correctamente";
        } else {
            return "No se pudo eliminar el sample con id " + id;
        }
    }

}