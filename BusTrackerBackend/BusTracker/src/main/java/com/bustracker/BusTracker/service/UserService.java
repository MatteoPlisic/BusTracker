package com.bustracker.BusTracker.service;

import com.bustracker.BusTracker.dto.UserDto;
import com.bustracker.BusTracker.entity.User;
import com.bustracker.BusTracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getAllUsers() {


        List<User> users = userRepository.findAll();

        return users.stream().map(this::convertToDto).collect(Collectors.toList());

    }

    private UserDto convertToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }
}
