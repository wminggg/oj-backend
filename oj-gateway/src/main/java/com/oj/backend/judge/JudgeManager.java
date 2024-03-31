package com.oj.backend.judge;

import com.oj.backend.judge.codesandbox.model.JudgeInfo;
import com.oj.backend.judge.strategy.DefaultJudgeStrategy;
import com.oj.backend.judge.strategy.JavaLanguageJudgeStrategy;
import com.oj.backend.judge.strategy.JudgeContext;
import com.oj.backend.judge.strategy.JudgeStrategy;
import com.oj.backend.model.entity.QuestionSubmit;
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
