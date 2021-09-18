package video;

import lesson.LessonModel;
import lesson.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRepository repo;

    public List<VideoModel> listAll() {
        return repo.findAll();
    }

    public void save(VideoModel videoModel) {
        repo.save(videoModel);
    }
}
