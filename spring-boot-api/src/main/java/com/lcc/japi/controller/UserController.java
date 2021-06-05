package com.lcc.japi.controller;

import com.lcc.japi.model.UserVO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User API
 * @author JohnLee001
 */
@RequestMapping("user")
@RestController
@CrossOrigin
public class UserController {


    /**
     获取用户信息
     * @param id 用户ID
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET})
    public List<UserVO> list(@RequestParam(required = false) int id) {
        List<UserVO> userList = new ArrayList<>();
        userList.add(new UserVO(id, "zhangsan", 1, "张三用户信息"));
        return userList;
    }

    /**
     * Save User
     * @param userVO
     */
    @PostMapping(path = "save")
    public UserVO saveUser(@RequestBody UserVO userVO){
        return null;
    }
//
//    /**
//     * Delete User
//     * @param userId user id
//     */
//    @PostMapping("delete")
//    public ApiResult deleteUser(@RequestParam Long userId){
//        return null;
//    }
}