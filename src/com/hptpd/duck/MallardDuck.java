package com.hptpd.duck;

import com.hptpd.duck.behavior.fly.FlyWithWings;
import com.hptpd.duck.behavior.quack.Quack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 10:59
 * \* Description:
 * \
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = Quack.getInstance();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("This is a real Mallard duck");
    }

    @Override
    public void swim() {

    }
}
