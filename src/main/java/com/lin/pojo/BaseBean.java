/**
 * 
 */
package com.lin.pojo;

	import java.io.Serializable;
	import java.lang.reflect.Field;
	import java.util.Calendar;
	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.MappedSuperclass;
	import javax.persistence.Transient;

	/**
	 * Title: BaseBean
	 * Description:
	 * @author XxX
	 * @date 2017年4月11日下午5:18:02
	 * @since 
	 */
	@MappedSuperclass
	public class BaseBean implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Column(columnDefinition="DATETIME")
		public Date createTime = Calendar.getInstance().getTime();//创建时间
		public String createName;//创建人
		public String createId;//创建人
		public String createIpAddress;//创建人IP地址
		public String createSystem;//创建数据系统
		@Column(columnDefinition="DATETIME")
		public Date updateTime = Calendar.getInstance().getTime();//更新时间
		public String updateName;//更新人
		public String updateId;//更新人
		public String updateIpAddress;//更新人地址
		public String updateSystem;//更新数据系统
		public int isDeleted;//是否删除

		@Transient
		public String[] fields;

		public String getEntityTitle() {
			return "实体";
		}

		public String toHql() {
			return "from " + getClass().getSimpleName();
		}

		public Date getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Date getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateName() {
			return createName;
		}

		public void setCreateName(String createName) {
			this.createName = createName;
		}

		public String getUpdateName() {
			return updateName;
		}

		public void setUpdateName(String updateName) {
			this.updateName = updateName;
		}

		public int getIsDeleted() {
			return isDeleted;
		}

		public void setIsDeleted(int isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String[] getFields() {
			return this.fields;
		}

		public void setFields(String[] fields) {
			this.fields = fields;
		}

		public String getCreateIpAddress() {
			return createIpAddress;
		}

		public void setCreateIpAddress(String createIpAddress) {
			this.createIpAddress = createIpAddress;
		}

		public String getUpdateIpAddress() {
			return updateIpAddress;
		}

		public void setUpdateIpAddress(String updateIpAddress) {
			this.updateIpAddress = updateIpAddress;
		}

		public String getCreateSystem() {
			return createSystem;
		}

		public void setCreateSystem(String createSystem) {
			this.createSystem = createSystem;
		}

		public String getUpdateSystem() {
			return updateSystem;
		}

		public void setUpdateSystem(String updateSystem) {
			this.updateSystem = updateSystem;
		}

		public String getCreateId() {
			return createId;
		}

		public void setCreateId(String createId) {
			this.createId = createId;
		}

		public String getUpdateId() {
			return updateId;
		}

		public void setUpdateId(String updateId) {
			this.updateId = updateId;
		}
		
	}
