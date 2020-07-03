package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @RequestMapping("doGoodUI")
    @ResponseBody
    public String doGoodUI(){
        return "goods";
    }
}
