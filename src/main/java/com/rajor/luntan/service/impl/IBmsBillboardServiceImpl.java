package com.rajor.luntan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rajor.luntan.mapper.BmsBillboardMapper;
import com.rajor.luntan.model.entity.BmsBillboard;
import com.rajor.luntan.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService {

}
