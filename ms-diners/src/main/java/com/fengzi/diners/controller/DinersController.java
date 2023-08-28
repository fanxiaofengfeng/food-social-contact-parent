package com.fengzi.diners.controller;

import com.fengzi.commons.model.domain.ResultInfo;
import com.fengzi.diners.service.DinersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author fengzi
 * @version v1.0.0
 * @Description : TODO
 * @Create on : 2023/8/28 15:15
 **/
@RestController
@Api(tags = "食客相关接口")
public class DinersController {

    @Resource
    private DinersService dinersService;

    @Resource
    private HttpServletRequest request;

    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    @GetMapping("signin")
    public ResultInfo signIn(String account, String password){
        return dinersService.signIn(account,password,request.getServletPath());

    }

}
