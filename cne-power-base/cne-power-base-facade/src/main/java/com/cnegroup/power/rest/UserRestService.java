package com.cnegroup.power.rest;

import com.cnegroup.power.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangth
 */
@FeignClient("cne-power-base-web")
public interface UserRestService {

    /**
     * 获取用户
     * 
     * @return
     */
    @GetMapping("/user")
    User getUser();

}
