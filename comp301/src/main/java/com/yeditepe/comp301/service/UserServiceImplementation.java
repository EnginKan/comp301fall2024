package com.yeditepe.comp301.service;

public class UserServiceImplementation extends UserService{
    @Override
    protected boolean validUser(String username, String password) {
        return false;
    }
}
