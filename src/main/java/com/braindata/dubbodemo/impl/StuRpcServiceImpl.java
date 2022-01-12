package com.braindata.dubbodemo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.braindata.dubbodemo.intf.StuRpcService;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/12 9:57 上午
 */
@Service
public class StuRpcServiceImpl implements StuRpcService {

    @Override
    public int add(int a, int b) {
        System.out.println("StuRpcServiceImpl#add》》》》》》》");
        return a+b;
    }
}
