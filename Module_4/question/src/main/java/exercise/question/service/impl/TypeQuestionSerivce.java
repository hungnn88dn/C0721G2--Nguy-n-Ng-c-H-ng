package exercise.question.service.impl;

import exercise.question.model.TypeQuestion;
import exercise.question.repostiory.TypeQuestionRepository;
import exercise.question.service.ITypeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeQuestionSerivce implements ITypeQuestionService {
    @Autowired
    TypeQuestionRepository typeQuestionRepository;
    @Override
    public List<TypeQuestion> findAll() {
        return typeQuestionRepository.findAll() ;
    }

    @Override
    public TypeQuestion findById(int id) {
        return typeQuestionRepository.findById(id).orElse(null);
    }
}
