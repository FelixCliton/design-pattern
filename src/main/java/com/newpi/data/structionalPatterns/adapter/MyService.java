package com.newpi.data.structionalPatterns.adapter;

import com.alibaba.fastjson.JSONObject;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 10:30 AM
 * @desc:
 */
public class MyService implements MyPartDataInterface {
    @Override
    public JSONObject processData() {
        JSONObject json = new JSONObject();
        json.put("mydata", "mydata");
        return json;
    }
}
