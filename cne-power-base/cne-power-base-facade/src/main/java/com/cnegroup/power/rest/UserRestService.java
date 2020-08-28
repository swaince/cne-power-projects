package com.cnegroup.power.rest;

import com.cnegroup.power.dto.User;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangth
 */
public interface UserRestService {

    /**
     * 获取用户
     * 
     * @return
     */
    @GetMapping("/user")
    User getUser();

}
