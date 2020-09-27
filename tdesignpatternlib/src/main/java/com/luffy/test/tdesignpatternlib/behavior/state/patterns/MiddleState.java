package com.luffy.test.tdesignpatternlib.behavior.state.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 中等
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
