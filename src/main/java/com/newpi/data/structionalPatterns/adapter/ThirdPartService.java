package com.newpi.data.structionalPatterns.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liujie3@yidian-inc.com
 * @version 1.0
 * @date: 2021/5/18 9:50 AM
 * @desc:
 */
public class ThirdPartService implements ThirdPartyDadaInterface{

    @Override
    public Map<String, String> fetchData() {
        Map<String, String> map = new HashMap<>();
        map.put("t1", "data1");
        map.put("t2", "data2");
        map.put("t3", "data3");
        return map;
    }
}
