package com.rajor.luntan.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@TableName("bms_quiz")
@Accessors(chain = true)
public class BmsQuiz implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 题目
     */
    @TableField("question")
    private String question;

    /**
     * A选项
     */
    @TableField("chioceA")
    private String chioceA;

    /**
     * b选项
     */
    @TableField("`chioceB`")
    private String chioceB;

    /**
     * C选项
     */
    @TableField("`chioceC`")
    private String chioceC;

    /**
     * D选项
     */
    @TableField("`chioceD`")
    private String chioceD;

    /**
     * 正确答案
     */
    @TableField("`answer`")
    private String answer;


    /**
     * 分数
     */
    @TableField("`score`")
    private String score;


    public BmsQuiz() {
    }
}
