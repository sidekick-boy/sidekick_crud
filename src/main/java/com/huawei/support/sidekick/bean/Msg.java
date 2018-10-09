package com.huawei.support.sidekick.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回通用信息
 * @author sidekick
 *
 * 2018年10月10日
 */
public class Msg {

	private String code;
	
    private String msg;
    
    private Map<String, Object> map = new HashMap<String, Object>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
    
    public static Msg success()
    {
    	Msg result = new Msg();
    	result.setCode("200");
    	result.setMsg("处理成功");
    	return result;
    }
    
    public static Msg fail()
    {
    	Msg result = new Msg();
    	result.setCode("500");
    	result.setMsg("处理失败");
    	return result;
    }
    
    public Msg add(String key, Object value)
    {
    	this.map.put(key, value);
    	return this;
    }
    
    
}
