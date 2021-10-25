package com.example.soap.service;

import com.example.soap.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<Integer, User> users = new HashMap<>();   //String is a key, User is a object
    //client could be like a library, we saying a name of variable 58:00 watch
    //once we generated, we have request
    public void inizialize(){

    User peter = new User();
    peter.setName("Peter");
    peter.setEmpId(1);
    peter.setSalary(1000);

    User lucas = new User();
    lucas.setName("Lucas");
    lucas.setEmpId(2);
    lucas.setSalary(1500);

    User maria = new User();
    maria.setName("Maria");
    maria.setEmpId(3);
    maria.setSalary(1800);

    users.put(peter.getEmpId(), peter);
    users.put(lucas.getEmpId(), lucas);
    users.put(maria.getEmpId(), maria);
}

    public User getUsers(int id) {
        return users.get(id);
    }
}
