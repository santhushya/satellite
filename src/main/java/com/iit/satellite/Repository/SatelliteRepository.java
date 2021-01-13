package com.iit.satellite.Repository;

import com.iit.satellite.Entity.Satellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long>{

}
