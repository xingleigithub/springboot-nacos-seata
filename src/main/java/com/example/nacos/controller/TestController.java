package com.example.nacos.controller;

import com.alibaba.boot.nacos.config.properties.NacosConfigProperties;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @author: xing-lei
 * @Time: 2020/5/14 15:20
 * @Copyright: © 找家纺版权所有
 * @Warning: 本内容仅限于公司内部传阅, 禁止外泄或用于其它商业目的
 */
@RestController
public class TestController {


    @NacosValue(value = "${test}", autoRefreshed = true)
    private String testProperties;


    @GetMapping("order")
    public String getmogoLog(){
        return testProperties;
    }


}
