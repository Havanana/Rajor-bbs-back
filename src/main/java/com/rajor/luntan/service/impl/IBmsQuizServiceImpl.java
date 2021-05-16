package com.rajor.luntan.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rajor.luntan.mapper.BmsQuizMapper;
import com.rajor.luntan.model.entity.BmsQuiz;
import com.rajor.luntan.service.IBmsQuizService;
import org.springframework.stereotype.Service;

@Service
public class IBmsQuizServiceImpl extends ServiceImpl<BmsQuizMapper
        , BmsQuiz> implements IBmsQuizService {

}
