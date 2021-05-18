package com.newpi.data.structionalPatterns.adapter;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 10:13 AM
 * @desc:
 */
public class Adapter extends ThirdPartService implements MyPartDataInterface {

    @Override
    public JSONObject processData() {
        Map<String, String> map = super.fetchData();
        return (JSONObject) JSONObject.toJSON(map);
    }
}
