package com.goods.goodsControll;

import com.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsControll {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/find")
    public Object find(Integer id){
          return goodsService.findbygoodsid(id);
    }
}
