package com.zxc.service;

import com.zxc.dubboserver.api.FansApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-06-25
 * Time: 上午11:37
 */
@RestController
@RequestMapping("/fans")
public class FansController {

    @Autowired
    private FansApi fansApi;

    @RequestMapping("hello")
    public String hello() {
        return fansApi.hello() + "client";
    }

}
