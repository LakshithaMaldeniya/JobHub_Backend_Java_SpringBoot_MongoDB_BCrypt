package com.devstack.joblisting.util;


import org.mindrot.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class PasswordManager {
    public String encrypt(String rawPassword){
        return BCrypt.hashpw(rawPassword,BCrypt.gensalt(10));
    }
    public boolean checkPassword(String rawPassword, String hashPassword){
        return BCrypt.checkpw(rawPassword, hashPassword);
    }
}
