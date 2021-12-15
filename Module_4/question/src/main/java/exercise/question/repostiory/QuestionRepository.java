package exercise.question.repostiory;

import exercise.question.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

    @Query(value= "select * from question join type_question where question.type_question_id = type_question.id and type_question.id = :id" , nativeQuery= true)
    Page<Question> findAllQuestionByTypeQuestionID(@Param("id") int id, Pageable pageable );

    Page<Question> findQuestionByTitleContaining(String title, Pageable pageable);
}
