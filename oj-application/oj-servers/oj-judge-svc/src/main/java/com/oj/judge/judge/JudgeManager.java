package com.oj.judge.judge;

import com.oj.judge.judge.strategy.DefaultJudgeStrategy;
import com.oj.judge.judge.strategy.JavaLanguageJudgeStrategy;
import com.oj.judge.judge.strategy.JudgeContext;
import com.oj.judge.judge.strategy.JudgeStrategy;
import com.oj.question.model.entity.QuestionSubmit;
import com.oj.sandbox.model.JudgeInfo;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
