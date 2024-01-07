package com.rt.plantguardianapi.services;

import com.rt.plantguardianapi.model.Plant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PlantsService {

  private final AtomicLong idCounter = new AtomicLong();
  private final Logger logger = Logger.getLogger(PlantsService.class.getName());

  public Plant findById(String id) {
    logger.info("Finding one plant!");

    Plant plant = new Plant();
    plant.setId(idCounter.incrementAndGet());
    plant.setName("Lettuce");

    return plant;
  }

  public List<Plant> findAll() {
    logger.info("Finding all plants!");

    List<Plant> plants = new ArrayList<Plant>();
    plants.add(new Plant(idCounter.incrementAndGet(), "Lettuce"));
    plants.add(new Plant(idCounter.incrementAndGet(), "Apple"));
    plants.add(new Plant(idCounter.incrementAndGet(), "Orange"));

    return plants;
  }

  public Plant create(Plant plant) {
    logger.info("Creating one plant!");

    plant.setId(idCounter.incrementAndGet());

    return plant;
  }

  public Plant update(Plant plant) {
    logger.info("Updating one plant!");

    plant.setId(idCounter.incrementAndGet());

    return plant;
  }

  public void delete(String id) {
    logger.info("Deleting one plant!");
  }
}
