package com.wu.serviceImpl;

import com.wu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by MJN on 2016/8/9.
 */
@Service
public class UserServiceImpl implements UserService {
    public String getUserName(String name){
        return name;
    }
}
