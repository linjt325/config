/**
 * 
 */
package com.lin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.dao.ConfigImportDao;
import com.lin.pojo.ConfigFlowChartsBean;
import com.lin.service.ConfigImportService;

/**
 * Title: ConfigImportService
 * Description:
 * @author XxX
 * @date 2017年4月11日下午2:29:50
 * @since 
 */
@Service
public class ConfigImportServiceImpl implements ConfigImportService{
	@Autowired
	private ConfigImportDao configImportDao;
	
	/** 
	* @Title: saveFlowChartsConfig 
	* @Description: TODO
	* @param config
	* @return
	* @throws Exception    设定文件 
	*/
	@Override
	public boolean saveFlowChartsConfig(ConfigFlowChartsBean config)
			throws Exception {
		if(null==config.getEnname()||null==config.getObjid()||null==config.getPicid()||null==config.getX()||null==config.getY()){
			return false;
		}
		configImportDao.save(config);
		return true;
	}

	
}
