package com.boot.bank.mapper;

import com.boot.bank.entity.QhReliabiltiyTemp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * <p> Created by gxx on 2017-08-25.
 * <p>在启动类配置mapper扫描，数据源自动注入
 */
public interface UserMapper {

    /****
     * <p>查询表的全部信息(select *) 要与返回的实体列信息一一对应，否则用@Result注解表明
     * @return 返回对象信息
     */
    @Select("select * from qh_reliabiltiy_temp order by id desc limit 1")
    QhReliabiltiyTemp getInfo();

    /****
     * <p>返回表中某一列的信息，用results执行列和字段的对应信息
     * @return  返回某个指定列的信息
     */
    @Select("select mobile from qh_reliabiltiy_temp order by id desc limit 1")
    @Results(
            {
                    @Result(property = "mobile", column = "mobile")
            }
    )
    String getInfoColums();

    /***
     * <p>新增信息
     * @param temp
     */
    @Insert("insert into qh_reliabiltiy_temp(mobile, credooScore) values (#{mobile}, #{credooScore})")
    void addInfo(QhReliabiltiyTemp temp);
}
