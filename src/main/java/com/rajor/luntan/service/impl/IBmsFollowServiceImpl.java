package com.rajor.luntan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rajor.luntan.mapper.BmsFollowMapper;
import com.rajor.luntan.model.entity.BmsFollow;
import com.rajor.luntan.service.IBmsFollowService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IBmsFollowServiceImpl extends ServiceImpl<BmsFollowMapper, BmsFollow> implements IBmsFollowService {
    @Override
    public List<BmsFollow> getInfoById(String parentId) {
//        return baseMapper.selectOne(new LambdaQueryWrapper<BmsFollow>().eq(BmsFollow::getParentId, parentId));
          return  baseMapper.selectList( new LambdaQueryWrapper<BmsFollow>().eq(BmsFollow::getParentId, parentId));
    }
    public List<BmsFollow> getInfoById2(String followerId) {
         return  baseMapper.selectList( new LambdaQueryWrapper<BmsFollow>().eq(BmsFollow::getFollowerId, followerId));
    }

}
