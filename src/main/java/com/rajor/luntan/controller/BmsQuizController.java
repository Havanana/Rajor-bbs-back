package com.rajor.luntan.controller;

import com.rajor.luntan.common.api.ApiResult;
import com.rajor.luntan.model.entity.BmsPromotion;
import com.rajor.luntan.model.entity.BmsQuiz;
import com.rajor.luntan.service.IBmsQuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class BmsQuizController {
    @Resource
    private IBmsQuizService bmsQuizService;

    @GetMapping("/all")
    public ApiResult<List<BmsQuiz>> list() {
         List<BmsQuiz> list = bmsQuizService.list();
        return ApiResult.success(list);
    }

}
