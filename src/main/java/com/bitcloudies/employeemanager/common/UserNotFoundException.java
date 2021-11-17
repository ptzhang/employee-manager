package com.bitcloudies.employeemanager.common;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
