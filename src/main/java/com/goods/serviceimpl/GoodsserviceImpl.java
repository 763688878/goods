package com.goods.serviceimpl;

import com.goods.pojo.Goods;
import com.goods.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoodsserviceImpl implements GoodsService {

    private static final Map<Integer,Goods> map=new HashMap<Integer,Goods>();
    static{
        map.put(1,new Goods(1,"java基础",77));
        map.put(2,new Goods(2,"java中级",277));
        map.put(3,new Goods(3,"java高级",577));

    }
    public Goods findbygoodsid(Integer id) {
        return map.get(id);
    }
}
