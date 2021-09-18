package user;

import Subject.SubjectModel;
import lesson.LessonModel;
import lesson.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    public List<UserModel> listAll() {
        return repo.findAll();
    }

    public void save(UserModel userModel) {
        repo.save(userModel);
    }


    public void update(UserModel userModel){
        UserModel userModelToUpdate = repo.getOne(userModel.getId());
        userModelToUpdate.setEmail(userModel.getEmail());
        userModelToUpdate.setFirstName(userModel.getFirstName());
        userModelToUpdate.setInstructor(userModel.isInstructor());
        userModelToUpdate.setLastName(userModel.getLastName());
        repo.save(userModelToUpdate);
    }

}
