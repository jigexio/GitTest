package com.chn.service.impl;

import com.chn.dao.MyUserDao;
import com.chn.pojo.MyUser;
import com.chn.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务实现类，业务功能的具体实现
 */
@Service("myUserService")
@Transactional
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private MyUserDao myUserDao;

    @Override
    public List<MyUser> selectUserByUname(MyUser myUser) {
        return myUserDao.selectByName(myUser);
    }
}
