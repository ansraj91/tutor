package Subject;

import lesson.LessonRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectModel, Long> {
}
