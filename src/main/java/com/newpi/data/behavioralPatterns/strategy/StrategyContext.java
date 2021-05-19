package com.newpi.data.behavioralPatterns.strategy;

import lombok.Data;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/19 7:45 PM
 * @desc:
 */
@Data
public class StrategyContext {

    private String contextInfo;

    private IStrategy strategy;

    public void process(){
        if (strategy != null) {
            strategy.execProcess(this);
        }
    }

}
