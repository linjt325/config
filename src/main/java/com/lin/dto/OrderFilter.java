package com.lin.dto;

/**
 * Title: OrderFilter
 * Description:
 * @author XxX
 * @date 2017年4月11日下午4:08:27
 * @since 
 */

public class OrderFilter {

	public static enum OrderFilterSort {
		ASC,DESC
	}
	
	
	public OrderFilter() {
		super();
	}

	public OrderFilter(String name) {
		super();
		this.name = name;
		this.sort = OrderFilterSort.ASC.toString();
	}
	
	
	public OrderFilter(String name, String sort) {
		super();
		this.name = name;
		this.sort = sort;
	}

	private String name;
	
	private String sort;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
}
