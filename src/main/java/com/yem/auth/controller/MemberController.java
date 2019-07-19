package com.yem.auth.controller;

import com.yem.auth.entity.Result;
import com.yem.auth.enumeration.ResultCode;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 用户授权凭证管理. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月2日 下午2:31:01 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@RestController("/api")
public class MemberController {

    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @DeleteMapping(value = "/exit")
    public Result revokeToken(String access_token) {
        //注销当前用户
        Result result = new Result();
        if (consumerTokenServices.revokeToken(access_token)) {
            result.setCode(ResultCode.SUCCESS.getCode());
            result.setMessage("注销成功");
        } else {
            result.setCode(ResultCode.FAILED.getCode());
            result.setMessage("注销失败");
        }
        return result;
    }

    @PostMapping(value = "/get")
    public Principal getUser(Principal principal) {
       return principal;
    }
}
