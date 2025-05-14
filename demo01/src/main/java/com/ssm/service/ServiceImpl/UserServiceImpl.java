package com.ssm.service.ServiceImpl;

import com.ssm.dao.IUserDao;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    IUserDao IUserDao;

//    public IUserDao getIUserDao() {
//        return IUserDao;
//    }
//
//    public void setIUserDao(IUserDao IUserDao) {
//        this.IUserDao = IUserDao;
//    }

    @Override
    public void getUser() {
        IUserDao.getUser();
    }
}
