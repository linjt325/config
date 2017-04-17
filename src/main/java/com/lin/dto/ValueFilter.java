/**
 * 
 */
package com.lin.dto;

/**
 * Title: ValueFilter
 * Description:
 * @author XxX
 * @date 2017年4月11日下午4:08:14
 * @since 
 */

public class ValueFilter {

	public static enum ValueFilterSign {
		EQ,GT,LT,LIKE,IN,NOTIN,EXIST
	}
	
	public static enum ValueFilterConnection {
		AND,OR
	}
	
	
	public ValueFilter(String name, Object value, String sign) {
		super();
		this.name = name;
		this.value = value;
		this.sign = sign;
		this.connection = ValueFilterConnection.AND.toString();
	}
	public ValueFilter(String name, Object value, String sign, String connection) {
		super();
		this.name = name;
		this.value = value;
		this.sign = sign;
		this.connection = connection;
	}
	
	
	public ValueFilter() {
		super();
	}


	private String name;
	private Object value;
	private String sign;
	private String connection = ValueFilterConnection.AND.toString();
	
	
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
}

