package com.scaler.basicapp;

import com.scaler.basicapp.pojos.CreateUserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController("/users")

@RequestMapping("/users")

public class UserController {
    private ArrayList<CreateUserRequest>users=new ArrayList<>();
@PostMapping("/")
    public CreateUserRequest createUser(@RequestBody CreateUserRequest user)
{
    return user;
}
@GetMapping("/{id}")
    public CreateUserRequest getUser(@PathVariable("id")int id)
{
    return users.get(id);
}

}
