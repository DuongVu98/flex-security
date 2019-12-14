package com.hcmiuiot.MicroSec.repositories;

import com.hcmiuiot.MicroSec.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserFakeRepository implements UserCustomRepository{

//    public List<User> initUsers(){
//        User user1 = new User("a","tony", "tungduong98");
//        User user2 = new User("b","tom", "xuantung98");
//
//        List<User> users = new ArrayList<>();
//
//        users.add(user1);
//        users.add(user2);
//
//        return users;
//    }
//
//    @Override
//    public List<User> getUsers() {
//        return this.initUsers();
//    }
//
//    @Override
//    public User getUser(String username) {
//        if(username.equals("tony")){
//            return new User("a", username, "tungduong98");
//        } else if(username.equals("tom")){
//            return new User("b", username, "xuantung98");
//        } else {
//            return null;
//        }
//    }
}
