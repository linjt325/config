/**
 * 
 */
package com.lin.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lin.dao.BaseDao;
import com.lin.pojo.BaseBean;

/**
 * Title: BaseDaoImpl
 * Description:
 * @author XxX
 * @date 2017年4月12日上午10:04:17
 * @since 
 */
public class BaseDaoImpl<T extends BaseBean> implements BaseDao {

	@Resource(name="commonSessionFactory")
	SessionFactory  sessionFactory;
	/** 
	* @Title: get 
	* @Description: TODO
	* @param id
	* @return
	* @throws Exception    设定文件 
	*/
	@Override
	public BaseBean get(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @Title: list 
	* @Description: TODO
	* @return
	* @throws Exception    设定文件 
	*/
	@Override
	public List list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @Title: list 
	* @Description: TODO
	* @param condition
	* @return
	* @throws Exception    设定文件 
	*/
//	@Override
//	public List list(Condition condition) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

	/** 
	* @Title: listByPage 
	* @Description: TODO
	* @param page
	* @throws Exception    设定文件 
	*/
//	@Override
//	public void listByPage(Page page) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

	/** 
	* @Title: listByPageAndHql 
	* @Description: TODO
	* @param page
	* @throws Exception    设定文件 
	*/
//	@Override
//	public void listByPageAndHql(Page page) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

	/** 
	* @Title: listByPageAndSql 
	* @Description: TODO
	* @param page
	* @throws Exception    设定文件 
	*/
//	@Override
//	public void listByPageAndSql(Page page) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

	/** 
	* @Title: list 
	* @Description: TODO
	* @param hql
	* @return
	* @throws InstantiationException
	* @throws IllegalAccessException
	* @throws ClassNotFoundException    设定文件 
	*/
	@Override
	public List list(String hql) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @Title: getAll 
	* @Description: TODO
	* @return
	* @throws Exception    设定文件 
	*/
	@Override
	public List getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @Title: getAll 
	* @Description: TODO
	* @param condition
	* @return
	* @throws Exception    设定文件 
	*/
//	@Override
//	public List getAll(Condition condition) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

	/** 
	* @Title: save 
	* @Description: TODO
	* @param baseBean
	* @throws Exception    设定文件 
	*/
	@Override
	public void save(BaseBean baseBean) throws Exception {
		sessionFactory.getCurrentSession().save(baseBean);sessionFactory.getCurrentSession().save(baseBean);
	}

	/** 
	* @Title: update 
	* @Description: TODO
	* @param baseBean
	* @throws Exception    设定文件 
	*/
	@Override
	public void update(BaseBean baseBean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/** 
	* @Title: merge 
	* @Description: TODO
	* @param baseBean
	* @throws Exception    设定文件 
	*/
	@Override
	public void merge(BaseBean baseBean) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(baseBean);
	}

	/** 
	* @Title: remove 
	* @Description: TODO
	* @param baseBean
	* @throws Exception    设定文件 
	*/
	@Override
	public void remove(BaseBean baseBean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/** 
	* @Title: removes 
	* @Description: TODO
	* @param ids
	* @throws Exception    设定文件 
	*/
	@Override
	public void removes(Serializable[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/** 
	* @Title: delete 
	* @Description: TODO
	* @param ids
	* @throws Exception    设定文件 
	*/
	@Override
	public void delete(Serializable[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/** 
	* @Title: count 
	* @Description: TODO
	* @param condition
	* @return
	* @throws Exception    设定文件 
	*/
//	@Override
//	public int count(Condition condition) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
