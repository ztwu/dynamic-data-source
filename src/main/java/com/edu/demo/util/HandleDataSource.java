package com.edu.demo.util;

/**
 * Created with Intellij IDEA.
 * User: ztwu2
 * Date: 2018/7/10
 * Time: 9:49
 * Description
 */

public class HandleDataSource {
    //很多地方叫做线程本地变量，也有些地方叫做线程本地存储，其实意思差不多。
    //ThreadLocal为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量。
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * 绑定当前线程数据源路由的key
     * @param datasource
     */
    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    /**
     * 获取当前线程的数据源路由的key
     * @return
     */
    public static String getDataSource() {
        return holder.get();
    }
}

