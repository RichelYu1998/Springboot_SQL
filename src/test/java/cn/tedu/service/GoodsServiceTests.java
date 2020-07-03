package cn.tedu.service;

import cn.tedu.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    private GoodsService goodsService;
    /*根据id删除数据
    * */
    @Test
    void testDeleteById(){
        int rows = goodsService.deleteById(15);
        System.out.println("rows="+rows);
    }
    /*查询所有数据
    */
    @Test
    public void testFindGoods(){
        List<Goods> list = goodsService.findGoods();
        for (Goods g:list) {
            System.out.println(g);
        }
    }
}
