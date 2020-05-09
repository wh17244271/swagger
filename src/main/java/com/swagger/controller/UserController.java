package com.swagger.controller;


import com.swagger.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author DDS
 * @date 2019/9/10 13:55
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", description = "提供用户相关的Rest API")
public class UserController {

    @PostMapping("/add")
    @ApiOperation(value = "新增用户接口", notes = "手机号、密码都是必输项，年龄随边填，但必须是数字")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名称", required = true, paramType = "form"),
            @ApiImplicitParam(name = "address", value = "用户地址", required = true, paramType = "form"),
            @ApiImplicitParam(name = "phone", value = "用户手机号", required = true, paramType = "form"),
            @ApiImplicitParam(name = "age", value = "用户年龄", required = true, paramType = "form", dataType = "Integer")
    })
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation(value = "通过id查找用户接口")
    @ApiImplicitParam(name = "id", value = "用户Id", required = true)
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户信息接口")
    @PutMapping("/update")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对"),
            @ApiResponse(code = 405, message = "未知错误")
    })
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除用户接口")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}