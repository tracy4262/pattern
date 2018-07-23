package com.hptpd.strategy;

import com.hptpd.strategy.behavior.fly.FlyWithWings;
import com.hptpd.strategy.behavior.quack.Quack;

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
        System.out.println("This is a real Mallard strategy");
    }

    @Override
    public void swim() {

    }
}
