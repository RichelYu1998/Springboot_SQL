package cn.tedu.dao;

import cn.tedu.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsDao {
    @Delete("delete from tb_goods where id=#{id}")
   /*根据id删除单个数据
    */
    int deleteById(Integer id);
    /*根据id删除多个数据
     */
    int deleteObjects(@Param("ids")Integer... ids);
    /*查询所有数据
     */
    @Select("select id,name,remark,createdTime from tb_goods")
    List<Goods> findObjects();
    /*添加数据*/
    @Insert("insert into tb_goods(name,remark,createdTime) values (#{name},#{remark},now())")
    int insertGoods(Goods entity);
}
