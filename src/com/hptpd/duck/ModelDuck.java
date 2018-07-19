package com.hptpd.duck;

import com.hptpd.duck.behavior.fly.FlyNoWay;
import com.hptpd.duck.behavior.quack.Quack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = Quack.getInstance();
    }

    @Override
    public void display() {
        System.out.println("This is a model duck!");
    }

    @Override
    public void swim() {

    }
}
