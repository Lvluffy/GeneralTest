package com.luffy.test.tdesignpatternlib.behavior.state.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 分数环境类
 */
public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public String add(int score) {
        return state.addScore(score);
    }

    public String subtract(int score) {
        return state.subtractScore(score);
    }
}
