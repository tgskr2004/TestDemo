
package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    private final Map<String, User> userStore = new HashMap<>();

    public void addUser(User user)          { userStore.put(user.getId(), user); }
    public User getUserById(String id)      { return userStore.get(id); }
    public boolean removeUser(String id)    { return userStore.remove(id) != null; }
}
