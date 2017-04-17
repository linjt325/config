/**
 * 
 */
package com.lin.dao;

import java.io.Serializable;
import java.util.List;

import com.lin.pojo.BaseBean;
//import com.waternet.dcBase.entity.Page;
//import com.waternet.dcBase.sqlCondition.Condition;


/**
 * Title: BaseDao
 * Description:
 * @author XxX
 * @date 2017年4月12日上午10:03:49
 * @since 
 */
public interface BaseDao<T extends BaseBean> {
	/**
	 * 根据ID获取对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
    public T get(Serializable id) throws Exception;
    /**
     * 获取全部对象
     * 不含查询条件
     * @return
     * @throws Exception
     */
    public List list() throws Exception;
    /**
     * 获取全部对象
     * 含查询条件
     * @param condition
     * @return
     * @throws Exception
     */
//    public List list(Condition condition) throws Exception;
    /**
     * 分页获取全部对象
     * @param page
     * @throws Exception
     */
//    public void listByPage(Page<BaseBean> page)  throws Exception;
    /**
     * 分页获取全部对象
     * @param page
     * @throws Exception
     */
//    public void listByPageAndHql(Page page) throws Exception;
    /**
     * 分页获取全部对象
     * @param page
     * @throws Exception
     */
//    public void listByPageAndSql(Page page) throws Exception;
    
    /**
     * 获取全部对象
     * @param hql
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public List list(String hql)throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    /**
     * 获取全部对象
     * @return
     * @throws Exception
     */
    public List<BaseBean> getAll()  throws Exception;
    /**
     * 获取全部对象,带排序参数.
     * @param orderBy
     * @param isAsc
     * @return
     * @throws Exception
     */
//    public List<BaseBean> getAll(Condition condition) throws Exception;
    
    /**
     * 保存对象
     * @param baseBean
     * @throws Exception
     */
    public void save(BaseBean baseBean) throws Exception;
    
    /**
     * 更新对象
     * @param baseBean
     * @throws Exception
     */
    public void update(BaseBean baseBean) throws Exception;
    
    /**
     * 合并对象
     * @param baseBean
     */
    public void merge(BaseBean baseBean) throws Exception;
    
    /**
     * 删除对象.
     */
    public void remove(BaseBean baseBean) throws Exception;
    /**
	 * 物理删除
	 * 慎用
	 * @param baseBean
	 * @throws Exception
	 */
	public void removes(Serializable[] ids)  throws Exception;
    /**
	 * 逻辑删除
	 * @param ids
	 * @throws Exception
	 */
	public void delete(Serializable[] ids)  throws Exception;
	/**
	 * 获取数据条数
	 * @param condition
	 * @return
	 * @throws Exception
	 */
//	public int count(Condition condition) throws Exception;
}
