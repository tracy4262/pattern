package com.hptpd.duck.behavior.quack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/7/19
 * \* Time: 10:47
 * \* Description:
 * \
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack!");
    }
}
