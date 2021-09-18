package Subject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository repo;

    public List<SubjectModel> listAll() {
        return repo.findAll();
    }

    public void save(SubjectModel subjectModel) {
        repo.save(subjectModel);
    }

    public void delete(SubjectModel subjectModel){
        repo.delete(subjectModel);
    }

    public void update(SubjectModel subjectModel){
        SubjectModel subjectModelToUpdate = repo.getOne(subjectModel.getId());
        subjectModelToUpdate.setName(subjectModel.getName());
        subjectModelToUpdate.setCourse(subjectModel.getCourse());
        repo.save(subjectModelToUpdate);
    }
}
