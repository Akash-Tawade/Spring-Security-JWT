package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<User>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Akash Tawade", "akash@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Prathamesh Patil", "prath@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Vishal Chavhan", "vishal@dev.in"));
    }

    public List<User> getUsers()
    {
        return this.store;
    }
}
