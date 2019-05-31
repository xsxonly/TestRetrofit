package com.example.xushengxia.testretrofit;

/**
 * Created by xushengxia on 2019/5/22.
 */

public class Bean {

    private int status;

    private String from;

    private String to;
    private String vendor;
    private String out;
    private int errNo;

    //定义 输出返回数据 的方法
    public void show() {
        System.out.println(status);
        System.out.println(from);
        System.out.println(to);
        System.out.println(vendor);
        System.out.println(out);
        System.out.println(errNo);
    }

    public String getResult() {
        return "Bean{" +
                "from=" + from +
                ", to=" + to +
                ", vendor='" + vendor +
                ", out=" + out +
                ", errNo=" + errNo +
                '}';
    }
}
