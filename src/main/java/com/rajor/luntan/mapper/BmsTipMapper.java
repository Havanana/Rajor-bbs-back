package com.rajor.luntan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rajor.luntan.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
