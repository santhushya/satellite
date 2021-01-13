package com.iit.satellite.Controller;

import com.iit.satellite.Entity.Satellite;
import com.iit.satellite.Service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class SatelliteController {

    @Autowired
    SatelliteService satelliteService;

    @PostMapping("/add")
    public long addSatellite(@RequestBody Satellite satellite){
        satelliteService.addSatellite(satellite);
        return satellite.getsID();
    }

    @GetMapping("/select/{id}")
    public Satellite selectSatellite(@PathVariable("id") Long sID){
        Optional<Satellite> satellite = satelliteService.selectSatellite(sID);
        return  satellite.get();
    }

    @GetMapping("/selectAll")
    public Iterable<Satellite> viewAllSatellites() {
        return satelliteService.getSatelliteHistory();
    }

    @DeleteMapping("/remove/{id}")
    public String deleteSatellite(@PathVariable("id") Long sID){
        Optional<Satellite> satellite = satelliteService.deleteSatellite(sID);
        return  "satellite removed";
    }
}
