package com.microservice.client.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class HitDTO {
    private int objectId;

    private String type;

    private String userName;

    private String ip;

    private String browser;

    private LocalDateTime viewed;

    private String applicationName;
}
