package com.channing.af.service.impl;

import com.channing.af.entity.Goods;
import com.channing.af.mapper.GoodsMapper;
import com.channing.af.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：cn406c0
 * @date ：Created in 5/10/2020 11:49 AM
 * @description：${The service layer for dealing with the goods logic}
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int save(Goods goods) {
        return goodsMapper.insert(goods);
    }
}
