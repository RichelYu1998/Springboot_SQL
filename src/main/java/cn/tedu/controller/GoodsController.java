package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class GoodsController {
    //请求地址
    //DispatcherServlet对象基于用户输入的url找到对应的Controller对象
    //DispatcherServlet底层会通过反射技术调用相对应的控制层方法
    @RequestMapping("doGoodsUI")
    public String doGoodUI(){
        return "goods";//view name
        //1.此view返回给前端控制器(DispatcherServlet)
        //2.前端控制器会调用视图解析器对view进行解析，添加前缀和后缀
        //3.最后由DispatcherServlet将页面响应到客户端
    }
}
