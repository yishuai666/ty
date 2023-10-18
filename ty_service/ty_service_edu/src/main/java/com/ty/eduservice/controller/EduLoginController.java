package com.ty.eduservice.controller;

import com.ty.commonutils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(description="登录管理")
@RestController
@RequestMapping("/eduservice/user")
//@CrossOrigin  //解决跨域
public class EduLoginController {

    //login
    @ApiOperation(value="登录")
    @PostMapping("login")
    public R login() {
        return R.ok().data("token","admin");
    }
    //info
    @ApiOperation(value="获取登录信息")
    @GetMapping("info")
    public R info() {
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
