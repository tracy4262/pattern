package com.hptpd.duck.behavior.fly;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 10:42
 * \* Description:
 * \
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings!");
    }
}
