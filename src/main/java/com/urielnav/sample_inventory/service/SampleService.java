package com.urielnav.sample_inventory.service;

import com.urielnav.sample_inventory.model.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.urielnav.sample_inventory.repository.SampleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public List<SampleModel> obtenerSamples() {
        return (List<SampleModel>) sampleRepository.findAll();
    }

    public SampleModel guardarSample(SampleModel s) {
        return sampleRepository.save(s);
    }

    public Optional<SampleModel> obtenerSamplePorId(Long id) {
        return sampleRepository.findById(id);
    }

    public boolean eliminarSamplePorId(Long id) {
        try {
            sampleRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}

