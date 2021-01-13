package com.iit.satellite.Service;


import com.iit.satellite.Entity.Satellite;
import com.iit.satellite.Repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SatelliteService {

    @Autowired
    SatelliteRepository satelliteRepository;

    public void addSatellite(Satellite satellite) {
        satelliteRepository.save(satellite);
    }

    public Iterable<Satellite> getSatelliteHistory() {
        return satelliteRepository.findAll();
    }


    public Optional<Satellite> selectSatellite(Long id) {
        return satelliteRepository.findById(id);
    }

    public Optional<Satellite> deleteSatellite(Long id) {
        satelliteRepository.deleteById(id);
        return null;
    }
}
