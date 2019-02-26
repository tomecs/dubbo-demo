package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * @description:
 * @author: fengmenglei
 * @date: 2019/2/26
 */
public interface OrderService {

    List<UserAddress> initOrder(String userId);
}
