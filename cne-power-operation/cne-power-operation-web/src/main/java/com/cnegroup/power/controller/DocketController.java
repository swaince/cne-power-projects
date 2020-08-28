package com.cnegroup.power.controller;

import com.cnegroup.power.dto.Docket;
import com.cnegroup.power.rest.DocketRestService;
import com.cnegroup.power.rest.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangth
 */
@RestController
public class DocketController implements DocketRestService {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @Override
    public Docket getDocket() {
        Docket docket = new Docket();
        docket.setId(1);
        docket.setName("docket");
        docket.setUser(userServiceFeign.getUser());
        return docket;
    }

}
