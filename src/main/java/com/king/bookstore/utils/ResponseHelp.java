package com.king.bookstore.utils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ResponseHelp {

	private ResponseHelp(){}
	
	private static JSONObject json;
	
	private static JSONArray arr;
	
	private static BackMsg msg;
	
	/**
	 * 将普通对象变为字符串
	 * @param obj
	 * @return
	 */
	public static String responseText(Object obj){
		json = JSONObject.fromObject(obj);
		return json.toString();
	}
	
	/**
	 * 将集合变成字符串
	 * @param array
	 * @return
	 */
	public static String responseArrayToText(Object array){
		arr = JSONArray.fromObject(array);
		msg = new BackMsg();
		msg.setContent(arr);
		json = JSONObject.fromObject(msg);
		return json.toString();
	}
	
	/**
	 * 返回默认成功信息
	 * @return
	 */
	public static String responseText(){
		msg = new BackMsg();
		json = JSONObject.fromObject(msg);
		return json.toString();
	}
	
	/**
	 * 返回默认失败 信息
	 * @param message
	 * @return
	 */
	public static String responseErrorText(String message){
		msg = new BackMsg();
		msg.setStatus(false);
		msg.setMessage(message);
		json = JSONObject.fromObject(msg);
		return json.toString();
	}
}
