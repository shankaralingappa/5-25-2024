package com.question.question.service;

import com.question.question.entity.Question;
import com.question.question.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionImpl implements  QuestionService
{
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question create(Question question)
    {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id)
    {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("question not found"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId)
    {
        return questionRepository.findByQuizId(quizId);
    }
}
