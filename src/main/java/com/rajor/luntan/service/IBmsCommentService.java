package com.rajor.luntan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rajor.luntan.model.dto.CommentDTO;
import com.rajor.luntan.model.entity.BmsComment;
import com.rajor.luntan.model.entity.UmsUser;
import com.rajor.luntan.model.vo.CommentVO;

import java.util.List;


public interface IBmsCommentService extends IService<BmsComment> {
    /**
     *
     *
     * @param topicid
     * @return {@link BmsComment}
     */
    List<CommentVO> getCommentsByTopicID(String topicid);

    BmsComment create(CommentDTO dto, UmsUser principal);
}
