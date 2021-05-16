package com.rajor.luntan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rajor.luntan.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
