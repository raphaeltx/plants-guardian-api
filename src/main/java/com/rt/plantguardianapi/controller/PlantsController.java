package com.rt.plantguardianapi.controller;

import com.rt.plantguardianapi.model.Plant;
import com.rt.plantguardianapi.services.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plant")
public class PlantsController {

  @Autowired
  private PlantsService service;

  private static final String template = "Hello %s from Plants Guardian! [%s]";

  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Plant findById(@PathVariable(value = "id") String id) {
    return service.findById(id);
  }

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Plant> findAll() {
    return service.findAll();
  }

  @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Plant create(@RequestBody Plant plant) {
    return service.create(plant);
  }

  @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Plant update(@RequestBody Plant plant) {
    return service.update(plant);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable(value = "id") String id) {
    service.delete(id);
  }
}
