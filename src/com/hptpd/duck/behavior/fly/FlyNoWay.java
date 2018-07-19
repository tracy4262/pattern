package com.hptpd.duck.behavior.fly;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 10:43
 * \* Description:
 * \
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly no way!");
    }
}
