package com.lin.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import com.waternet.dcBase.entity.BaseBean;


/**
 * 工艺图配置表
 * 工艺图上数据点坐标id等配置
 * @author Administrator
 *
 */
@Entity
@Table(name="system_config_flowCharts")
public class ConfigFlowChartsBean extends BaseBean {
//	extends BaseBean
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;
	//数据显示top属性
	private Integer y;
	//数据显示left属性
	private Integer x;
	//工艺图编号
	private Integer picid;
	//实时数据对象id
	private Integer objid;
	//title显示
	private String title;
	//实时数据字段名
	private String enname;
	//数据格式化方法
	private String formatter;
	//单位
	private String unit;
	//备注
	private String remark;
	//字体颜色
	private String color;
	//字体是否加粗
	private String weight;
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getPicid() {
		return picid;
	}

	public void setPicid(Integer picid) {
		this.picid = picid;
	}

	public Integer getObjid() {
		return objid;
	}

	public void setObjid(Integer objid) {
		this.objid = objid;
	}

	public String getEnname() {
		return enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
 
	
}
