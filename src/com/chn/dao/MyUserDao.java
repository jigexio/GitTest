package com.chn.dao;

import com.chn.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口，实现功能化对接（数据链路层）
 */
@Repository("myUserDao")
@Mapper
public interface MyUserDao {
    public List<MyUser> selectByName(MyUser myUser);
}
