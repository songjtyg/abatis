package org.sjt.mybatis.provider;

import java.util.Map;

/**
 * Created by songjiangtao
 */
public class PoiSqlProvider {

    public String insertPoiBo(Map<String,Object> map){
//        PoiPO poiPOBo = (PoiPO)map.get("poiPOBo");
//        StringBuilder sql = new StringBuilder("insert into poi ");//table name is poi_shop
//        //get sql via reflection and annotation
//        String insertSql = SqlGenrateUtil.getInsertSql(poiPOBo, "poiPOBo");
//        return sql + insertSql;
        return "";
    }
    public String selectPoiBo(Map<String,Object> map){
        //PoiPO poiPOBo = (PoiPO)map.get("poiPOBo");
        StringBuilder sql = new StringBuilder("select * from poi aaaaaaaaaaa ");
        //get sql via reflection and annotation
        String selectSql = "";
        //String selectSql = SqlGenrateUtil.getSelectSql(poiPOBo, "poiPOBo");
        return sql + selectSql;
    }
}
