package com.question.question.service;

import com.question.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionService
{
    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);

}
