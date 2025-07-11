package com.bustracker.BusTracker.controller;

import com.bustracker.BusTracker.dto.UserDto;
import com.bustracker.BusTracker.repository.UserRepository;
import com.bustracker.BusTracker.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Tag(name = "User Management", description = "APIs for managing users")
public class UserController {

    private final UserService userService;

    @GetMapping
    @Operation(summary = "Get a list of all users")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

}
