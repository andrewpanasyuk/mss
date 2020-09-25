package com.microservice.statistic.repository;

import com.microservice.statistic.model.Hit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HitRepository extends JpaRepository<Hit, Long> {

    int countByObjectIdAndType(int objectId, String type);
}
