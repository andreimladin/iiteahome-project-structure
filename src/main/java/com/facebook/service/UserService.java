package com.facebook.service;

import com.facebook.dao.UserDao;
import com.facebook.model.User;

public class UserService {

    private UserDao userDao;

    public boolean login(String username, String password) {
//        User user = userDao.getUser(username, password);
//        if (user.isActive()) {
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }

    public void signUp(String email, String password){
        // verify user doesn't yet exist
        // persist user (inactive)
        // confirmation email
    }

    public void confirm() {
        // confirm user -> active
    }


}
