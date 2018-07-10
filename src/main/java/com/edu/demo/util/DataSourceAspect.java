package com.edu.demo.util;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 执行dao方法之前的切面
 * 获取datasource对象之前往HandleDataSource中指定当前线程数据源路由的key
 *
 * @author Administrator
 */
public class DataSourceAspect {
    /**
     * 在dao层方法之前获取datasource对象之前在切面中指定当前线程数据源路由的key
     */
    public void before(JoinPoint point) {
        Object target = point.getTarget();
        System.out.println("切点对应的类："+target.toString());
        String method = point.getSignature().getName();
        System.out.println("切点对应的方法："+method);
        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            System.out.println("切点对应的方法："+m.getName());
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                System.out.println("用户选择数据库库类型：" + data.value());
                HandleDataSource.putDataSource(data.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}