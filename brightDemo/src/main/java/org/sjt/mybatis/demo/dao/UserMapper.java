package org.sjt.mybatis.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.sjt.mybatis.demo.model.UserPO;

import java.util.List;

/**
 * Created by jack on 2017/4/20.
 */
@Mapper
@Repository
public interface UserMapper {
    List<UserPO> searchAll();
}
