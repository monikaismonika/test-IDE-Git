package com.atguigu.redistemplatetest.controller;

import com.atguigu.redistemplatetest.VO.getGoodsListLimit;
import com.atguigu.redistemplatetest.service.testRedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@Log4j2
@RestController
@Api(tags = "订单API")
public class testRedisController {

    @Resource
    testRedisService testRedisService;

    @ApiOperation("新增订单")
    @PostMapping("/Order")
    public void setOrder(){
        testRedisService.setOrder();
    }

    @ApiOperation("查询订单")
    @GetMapping("/Order/{orderId}")
    public String getOrder(@PathVariable String orderId){
        return testRedisService.getOrder(orderId);
    }

    @ApiOperation("获取商品列表")
    @PostMapping("/getGoodsListLimit")
    public getGoodsListLimit getGoodsListLimit(@RequestBody getGoodsListLimit getGoodsListLimit){
        return testRedisService.getGoodsListLimitService(getGoodsListLimit);
    }

}
