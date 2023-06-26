package com.atguigu.redistemplatetest.service;

import com.atguigu.redistemplatetest.VO.getGoodsListLimit;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;


@Service
@Log4j2
public class testRedisService {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    //订单头
    public static final String ORDER_HEAD = "ord:";

    //添加订单
    public void setOrder(){
        //ThreadLocalRandom.current.nextInt   保证多线程时数字的唯一性
        int orderInt = ThreadLocalRandom.current().nextInt(1000)+1;
        // 订单编号信息
        String orderValue = "京东"+UUID.randomUUID().toString();

        String key = ORDER_HEAD+orderInt;

        stringRedisTemplate.opsForValue().set(key,orderValue);
        log.info("key: {} value: {}",key,orderValue);

    }

    //获取订单信息
    public String getOrder(String orderId){
        return stringRedisTemplate.opsForValue().get(ORDER_HEAD+orderId);
    }

    public getGoodsListLimit getGoodsListLimitService(getGoodsListLimit getGoodsListLimit) {
        int userLimit = getGoodsListLimit.getLimit();
        int userCurrentPage = getGoodsListLimit.getCurrentPage();
        int userCurrentCount = userLimit * userCurrentPage;
        int[] data = new int[userLimit];
        if (userCurrentCount <= (40-userLimit)){
            for (int i = 0; i < userLimit; i++) {
                data[i] = userCurrentCount+i+1;
            }
            getGoodsListLimit.setCurrentPage(userCurrentPage+1);
            getGoodsListLimit.setData(data);
            getGoodsListLimit.setTotal(40);
            return getGoodsListLimit;
        }
        return new getGoodsListLimit();
    }
}
