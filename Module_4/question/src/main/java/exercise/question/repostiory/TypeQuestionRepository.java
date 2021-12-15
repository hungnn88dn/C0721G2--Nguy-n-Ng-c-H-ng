package exercise.question.repostiory;

import exercise.question.model.TypeQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeQuestionRepository  extends JpaRepository<TypeQuestion,Integer> {
}
