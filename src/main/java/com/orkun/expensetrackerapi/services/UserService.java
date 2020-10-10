package com.orkun.expensetrackerapi.services;

import com.orkun.expensetrackerapi.domain.User;
import com.orkun.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password)
            throws EtAuthException;
}
