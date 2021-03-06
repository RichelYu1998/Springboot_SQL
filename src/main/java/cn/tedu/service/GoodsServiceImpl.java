package cn.tedu.service;

import cn.tedu.dao.GoodsDao;
import cn.tedu.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService{


    @Autowired
    private  GoodsDao goodsDao;
    /*
    * 添加数据
    * */
    @Override
    public int saveGoods(Goods entity) {
        int rows = goodsDao.insertGoods(entity);
        return rows;
    }

    /*根据id删除数据
     * */
    @Override
    public int deleteById(Integer id) {
        int rows = goodsDao.deleteById(id);
        return rows;
    }
    /*查询所有数据
     * */
    private Map<Object,Object> cache=new HashMap<>();
    @Override
    public List<Goods> findGoods() {
        long start = System.currentTimeMillis();
        List<Goods> list = goodsDao.findObjects();
        cache.put("goodsKey",list);
        long end = System.currentTimeMillis();
        System.out.println("query time="+(end-start));
        return list;
    }

    @Override
    public List<Goods> findObjects() {
        List<Goods> list = goodsDao.findObjects();
        return list;
    }
}
