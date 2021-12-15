package exercise.question.service.impl;

import exercise.question.model.Question;
import exercise.question.repostiory.QuestionRepository;
import exercise.question.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return this.questionRepository.findAll();
    }

    @Override
    public Question findById(int id) {
        return this.questionRepository.findById(id).orElse(null);
    }

    @Override
    public Question save(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public void delete(Question question) {
       this.questionRepository.delete(question);
    }

    @Override
    public void deleteById(int id) {
        this.questionRepository.deleteById(id);
    }

    @Override
    public Page<Question> findAllQuestion(Pageable pageable) {
        return this.questionRepository.findAll(pageable);
    }

    @Override
    public Page<Question> findAllQuestionByFilmID(int id, Pageable pageable) {
        return questionRepository.findAllQuestionByTypeQuestionID(id,pageable);
    }

    @Override
    public boolean existsByShowCode(String showCode) {
        return false;
    }

    @Override
    public Page<Question> findQuestionByTitle(String title, Pageable pageable) {
        return this.questionRepository.findQuestionByTitleContaining(title,pageable);
    }
}
