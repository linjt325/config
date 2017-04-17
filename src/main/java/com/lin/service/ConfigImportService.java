/**
 * 
 */
package com.lin.service;

import com.lin.pojo.ConfigFlowChartsBean;

/**
 * Title: ConfigImportService
 * Description:
 * @author XxX
 * @date 2017年4月11日下午2:30:23
 * @since 
 */
public interface ConfigImportService {

	boolean saveFlowChartsConfig(ConfigFlowChartsBean config)throws Exception;
}
