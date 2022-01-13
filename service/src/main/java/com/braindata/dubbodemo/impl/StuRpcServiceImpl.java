package com.braindata.dubbodemo.impl;

import com.braindata.dubbodemo.intf.StuRpcService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/12 9:57 上午
 */
@DubboService(version = "1.0.0",group = "stu-rpc-server")
public class StuRpcServiceImpl implements StuRpcService {

    @Override
    public int add(int a, int b) {
        System.out.println("StuRpcServiceImpl#add》》》》》》》");
        return a+b;
    }
}
