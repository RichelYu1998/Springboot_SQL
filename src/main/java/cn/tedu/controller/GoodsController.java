package cn.tedu.controller;

import cn.tedu.pojo.Goods;
import cn.tedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {//web处理层
    @Autowired
    private GoodsService goodsService;
    //请求地址
    //DispatcherServlet对象基于用户输入的url找到对应的Controller对象
    //DispatcherServlet底层会通过反射技术调用相对应的控制层方法
    @RequestMapping("doGoodsUI")
    public String doGoodUI(Model model){
        //获取业务数据
        List<Goods> list = goodsService.findObjects();
        //将数据存储到作用域对象
        model.addAttribute("list",list);
        //将页面响应到客户端
        return "goods";//view name
        //1.此view返回给前端控制器(DispatcherServlet)
        //2.前端控制器会调用视图解析器对view进行解析，添加前缀和后缀
        //3.最后由DispatcherServlet将页面响应到客户端
    }
}
