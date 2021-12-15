package exercise.question.service;

import exercise.question.model.TypeQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITypeQuestionService {
    public List<TypeQuestion> findAll();
    public TypeQuestion findById(int id);
}
