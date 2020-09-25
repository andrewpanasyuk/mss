package com.microservice.statistic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Hit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int objectId;

    private String type;

    private String userName;

    private String ip;

    private String browser;

    private LocalDateTime viewed;

    private String applicationName;
}
