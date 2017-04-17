/**
 * 
 */
package com.lin.dto;

import java.io.Serializable;

/**
 * Title: ResultMap
 * Description:
 * @author XxX
 * @date 2017年4月11日下午2:24:57
 * @since 
 */
public class ResultMap<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean success;
	
	private String message;
	
	private T data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	
	
 }
