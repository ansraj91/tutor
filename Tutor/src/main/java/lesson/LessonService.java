package lesson;

import course.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    LessonRepository repo;

    public List<LessonModel> listAll() {
        return repo.findAll();
    }

    public void save(LessonModel lessonModel) {
        repo.save(lessonModel);
    }

    public void update(LessonModel lessonModel){
        LessonModel lessonModelToUpdate = repo.getOne(lessonModel.getId());
        lessonModelToUpdate.setName(lessonModel.getName());
        lessonModelToUpdate.setIsActive(lessonModel.getIsActive());
        lessonModelToUpdate.setVideo(lessonModel.getVideo());
        lessonModelToUpdate.setCourses(lessonModel.getCourses());


        repo.save(lessonModel);
    }
}
