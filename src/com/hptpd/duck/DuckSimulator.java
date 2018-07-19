package com.hptpd.duck;

import com.hptpd.duck.behavior.fly.FlyRocketPowered;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 11:03
 * \* Description:
 * \
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.display();
    }
}
