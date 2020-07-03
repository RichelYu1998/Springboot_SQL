package cn.tedu.service;

import cn.tedu.pojo.Goods;

import java.util.List;

public interface GoodsService {
    /*根据id删除数据
    * */
    int deleteById(Integer id);
    /*查询所有数据
    * */
    List<Goods> findGoods();
}
