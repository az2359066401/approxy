package com.vivo.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.vivo.pojo.TbBrand;
import com.vivo.pojo.TbConfig;
import com.vivo.shop.service.TbConfigService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/tbConfig")
public class TbConfigController {

	@Reference
	private TbConfigService tbConfigService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbConfig> findAll(){
		return tbConfigService.findAll();
	}
	

	
}
