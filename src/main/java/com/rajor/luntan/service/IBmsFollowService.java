package com.rajor.luntan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rajor.luntan.model.entity.BmsFollow;

import java.util.List;


public interface IBmsFollowService extends IService<BmsFollow> {
    List getInfoById(String parentId);
    List getInfoById2(String followerId);
}
