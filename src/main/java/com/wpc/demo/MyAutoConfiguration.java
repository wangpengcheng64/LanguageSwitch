package com.wpc.demo;

/**
 * Created by zhangshukang on 2018/9/20.
 */

//@Configuration
//@ConditionalOnProperty(name = "enabled.autoConfituration", matchIfMissing = true)
public class MyAutoConfiguration {

    static {
        System.out.println("myAutoConfiguration init...");
    }

}
