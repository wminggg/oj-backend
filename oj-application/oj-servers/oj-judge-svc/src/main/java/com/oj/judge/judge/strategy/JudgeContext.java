package com.oj.judge.judge.strategy;

import com.oj.judge.model.dto.JudgeCase;
import com.oj.question.model.entity.Question;
import com.oj.question.model.entity.QuestionSubmit;
import com.oj.sandbox.model.JudgeInfo;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
