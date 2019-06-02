package org.sjt.mybatis.demo.dao;

import org.sjt.mybatis.annotation.Smart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sjt.mybatis.demo.model.PoiPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by songjiangtao
 */
@Mapper
@Repository
public interface PoiMapper {


//    /**
//     * without using utils
//     * @param poiPOBo
//     * @return
//     */
//    @Deprecated
//    @Insert("insert into poi_shop(name,brand,tags,status,phone,mobile,business_time,address,city,lng,lat,business_type,attribute_json) values(#{name},#{brand},#{tags},#{status},#{phone},#{mobile},#{business_time},#{address},#{city},#{lng},#{lat},#{business_type},#{attribute_json})")
//    public int insertPoiInfo(PoiPO poiPOBo);
//
//
//    /**
//     * using utils
//     * @param poiPOBo
//     * @return
//     */
//    @InsertProvider(type = PoiSqlProvider.class, method = "insertPoiBo")
//    int insertPoiInfoNew(@Param("poiPOBo")PoiPO poiPOBo);

    /**
     * using utils
     * @param poiPOBo
     * @return
     */
    //@InterceptAnnotation
    //@SelectProvider(type = PoiSqlProvider.class, method = "selectPoiBo")
    //@Select("select * from poi")
    //@Smart
    @Smart
    List<PoiPO> listPoi(@Param("poiPOBo")PoiPO poiPOBo);
}
