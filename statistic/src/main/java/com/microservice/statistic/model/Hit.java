package com.microservice.statistic.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Hit {

    private Long id;

    private int objectId;

    private String type;

    private String userName;

    private String ip;

    private String browser;

    private LocalDateTime viewed;

    private String applicationName;
}
