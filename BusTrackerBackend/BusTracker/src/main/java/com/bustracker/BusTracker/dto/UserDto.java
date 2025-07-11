package com.bustracker.BusTracker.dto;

import lombok.Data;
import java.time.OffsetDateTime;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private OffsetDateTime createdAt;

}
