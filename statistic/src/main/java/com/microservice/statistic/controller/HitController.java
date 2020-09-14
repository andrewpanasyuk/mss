//package com.microservice.statistic.controller;
//
//import com.github.dozermapper.core.DozerBeanMapperBuilder;
//import com.github.dozermapper.core.Mapper;
//import it.discovery.statistics.client.dto.HitClient;
//import it.discovery.statistics.client.dto.HitDTO;
//import it.discovery.statistics.model.Hit;
//import it.discovery.statistics.repository.HitRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("hit")
//public class HitController implements HitClient {
//    @Autowired
//    private HitRepository hitRepository;
//
//    private final Mapper dozerBeanMapper = DozerBeanMapperBuilder.create().build();
//
//    @GetMapping("{id}/{type}")
//    public int getHitCount(@PathVariable int id, @PathVariable String type) {
//        return hitRepository.countByObjectIdAndType(id, type);
//    }
//
//    @PostMapping
//    public void saveHit(@RequestBody HitDTO hitDTO) {
//        Hit hit = dozerBeanMapper.map(hitDTO, Hit.class);
//        hitRepository.save(hit);
//    }
//}
