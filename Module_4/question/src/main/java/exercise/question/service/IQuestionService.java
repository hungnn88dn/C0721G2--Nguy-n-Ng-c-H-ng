package exercise.question.service;

import exercise.question.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IQuestionService {
    public List<Question> findAll();
    public Question findById(int id);
    Question save(Question question);
    void delete(Question question);
    void deleteById(int id);
    public Page<Question> findAllQuestion(Pageable pageable);
    public Page<Question> findAllQuestionByFilmID(int id,Pageable pageable);
    boolean existsByShowCode(String showCode);
    public Page<Question> findQuestionByTitle(String title,Pageable pageable);
}
