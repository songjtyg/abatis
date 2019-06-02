package org.sjt.mybatis.demo.impl;

import org.sjt.mybatis.demo.App;
import org.sjt.mybatis.demo.dao.UserMapper;
import org.sjt.mybatis.demo.model.PoiPO;
import org.sjt.mybatis.demo.service.impl.PoiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})// 指定启动类
public class PoiServiceTest {
    @Autowired
    PoiService poiService;
    @Autowired
    UserMapper userMapper;

    @Test
    public void testOne(){
        System.out.println("#################测试开始########################");
//        List<UserPO> pos  = userMapper.searchAll();

        PoiPO poiPO = new PoiPO();
        poiPO.setAddress("地址1");

        List<PoiPO> pois = poiService.listPoi(poiPO);

        System.out.println("$$$$$$$$$$$$$$$$$$测试结束$$$$$$$$$$$$$$$$$$$$$:" + pois.size());
    }
}
