package com.rajor.luntan.controller;

import com.rajor.luntan.common.api.ApiResult;
import com.rajor.luntan.model.entity.*;
import com.rajor.luntan.service.IBmsFollowService;
import com.rajor.luntan.service.IUmsUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/follow")
public class BmsFollowController {
    @Resource
    private IBmsFollowService bmsFollowService;
    @Resource
    private IUmsUserService iUmsUserService;

    @GetMapping("/{id}")
    public ApiResult<Map<String, Object>> getInfoById(@PathVariable("id") String id,
                                            @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                            @RequestParam(value = "size", defaultValue = "10") Integer size){

        Map<String, Object> map = new HashMap<>(16);

        List user = bmsFollowService.getInfoById(id);
        List userAll = new ArrayList();

        map.put("user", user);
        for(int i=0;i<user.size();i++){
            String a=String.valueOf(user.get(i));
            String b=a.substring(a.length()-20, a.length()-1);
            System.out.println(b);
            UmsUser user1=iUmsUserService.getUserById2(b);
            userAll.add(user1);
        }
        map.put("topics", userAll);

        return ApiResult.success(map);
    }

    @GetMapping("/validate/{id}")
    public ApiResult<Map<String, Object>> getInfoById2(@PathVariable("id") String id,
                                                       @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                                       @RequestParam(value = "size", defaultValue = "10") Integer size){

        Map<String, Object> map = new HashMap<>(16);

        List user = bmsFollowService.getInfoById2(id);
        List userAll = new ArrayList();

        map.put("user", user);
        for(int i=0;i<user.size();i++){
            String a=String.valueOf(user.get(i));
            String b=a.substring(a.length()-20, a.length()-1);
            System.out.println(b);
            UmsUser user1=iUmsUserService.getUserById(b);
            userAll.add(user1);
        }
        map.put("topics", userAll);

        return ApiResult.success(map);
    }


}
