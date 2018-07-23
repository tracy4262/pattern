package com.hptpd.observer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/23
 * \* Time: 14:40
 * \* Description:  观察者模式观察者接口
 * \
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
