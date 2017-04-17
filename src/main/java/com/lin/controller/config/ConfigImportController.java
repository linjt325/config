/**
 * 
 */
package com.lin.controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lin.dto.ResultMap;
import com.lin.pojo.ConfigFlowChartsBean;
import com.lin.service.ConfigImportService;

/**
 * Title: ConfigImportController
 * Description:
 * @author XxX
 * @date 2017年4月11日下午2:18:36
 * @since 
 */
@Controller
@RequestMapping(value="configImport")
public class ConfigImportController {
	
	@Autowired
	private ConfigImportService configService;
	
	@RequestMapping(value="save")
	@ResponseBody
	public ResultMap<Object>  saveFlowChartsConfig(ConfigFlowChartsBean config) throws Exception{
		ResultMap<Object> rs=new ResultMap<Object>();
		if(null==config){
			rs.setSuccess(false);
			rs.setMessage("参数不能为空");
			rs.setData(null);
		}
		boolean isSuccess=configService.saveFlowChartsConfig(config);
		if(isSuccess){
			rs.setSuccess(isSuccess);
			rs.setMessage("成功");
		}else{
			rs.setSuccess(isSuccess);
			rs.setMessage("插入失败");
		}
		return rs;
		
	}
}
