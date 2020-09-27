package com.luffy.test.tdesignpatternlib.behavior.state.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 抽象状态
 */
public abstract class AbstractState {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public String addScore(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        score += x;
        stringBuilder.append("加上：").append(x).append("分，\t当前分数：").append(score);
        checkState();
        stringBuilder.append("分，\t当前状态：").append(hj.getState().stateName);
        return stringBuilder.toString();
    }

    public String subtractScore(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        score -= x;
        stringBuilder.append("减去：").append(x).append("分，\t当前分数：").append(score);
        checkState();
        stringBuilder.append("分，\t当前状态：").append(hj.getState().stateName);
        return stringBuilder.toString();
    }
}
