package course;

import Subject.SubjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;

    public List<CourseModel> listAll() {
        return repo.findAll();
    }

    public void save(CourseModel courseModel) {
        repo.save(courseModel);
    }

    public void update(CourseModel courseModel){
        CourseModel courseModelToUpdate = repo.getOne(courseModel.getId());
        courseModelToUpdate.setName(courseModel.getName());
        courseModelToUpdate.setIsActive(courseModel.getIsActive());
        courseModelToUpdate.setSubjects(courseModel.getSubjects());
        courseModelToUpdate.setLesson(courseModel.getLesson());
        courseModelToUpdate.setMostViewed(courseModel.getMostViewed());

        repo.save(courseModelToUpdate);
    }
}
