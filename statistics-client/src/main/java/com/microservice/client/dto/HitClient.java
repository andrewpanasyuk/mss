package com.microservice.client.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("statistics")
public interface HitClient {
    @GetMapping("hit/{id}/{type}")
    int getHitCount(@PathVariable("id") int id, @PathVariable("type") String type);

    @PostMapping("hit")
    void saveHit(@RequestBody HitDTO hitDTO);
}
