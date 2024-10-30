package com.yeditepe.comp301.service;

import org.springframework.stereotype.Service;

@Service
public abstract class UserService {

    protected abstract boolean validUser(String username, String password);
}
