package com.cnegroup.power.rest;

import com.cnegroup.power.dto.Docket;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangth
 */
public interface DocketRestService {

	/**
	 * 获取docket
	 * 
	 * @return
	 */
	@GetMapping("/docket")
	Docket getDocket();

}
