package cn.tedu.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class GoodsDaoTests {
    @Resource
    private GoodsDao goodsDao;
    @Test
    public void testDeleteById() {
        int rows=goodsDao.deleteById(10);
        System.out.println("rows="+rows);
    }
    @Test
    public void testDeleteObjects(){
        int rows = goodsDao.deleteObjects(10, 11, 12);
        System.out.println("rows="+rows);
    }
}
