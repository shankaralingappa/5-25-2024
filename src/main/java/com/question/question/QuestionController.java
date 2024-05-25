package com.question.question;

import com.question.question.entity.Question;
import com.question.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")

public class QuestionController
{

    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public Question create(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    @GetMapping("/get")
    public List<Question> getAll()
    {
        return  questionService.get();
    }

    @GetMapping("/getone")
    public Question getOne(@PathVariable Long id)
    {
      return  questionService.getOne(id);
    }

    //get all question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuiz(quizId);
    }


}
