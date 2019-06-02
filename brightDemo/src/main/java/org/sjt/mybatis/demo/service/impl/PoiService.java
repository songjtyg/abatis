package org.sjt.mybatis.demo.service.impl;

import org.sjt.mybatis.demo.dao.PoiMapper;
import org.sjt.mybatis.demo.model.PoiPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by songjiangtao
 */
@Service
public class PoiService {

    @Resource
    private PoiMapper poiMapper;

    public List<PoiPO> selectPoi(PoiPO poiPO){
        return  poiMapper.listPoi(poiPO);
    }

    public List<PoiPO> listPoi(PoiPO poiPO) {
        //  PageHelper.startPage(0, 1);
        List<PoiPO> poiPOs = poiMapper.listPoi(poiPO);
        //  PageInfo<PoiPO> appsPageInfo = new PageInfo<>(poiPOs);
        return poiPOs;
    }
}
