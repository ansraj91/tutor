package lesson;

import Subject.SubjectModel;
import course.CourseModel;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import video.VideoModel;

import javax.annotation.Generated;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="lesson")
@Data
public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private Long name;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @Column(name = "is_active")
    private Boolean isActive;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date",nullable = false)
    private LocalDate modifyDate;

    @OneToMany(mappedBy = "lesson")
    private List<CourseModel> courses;

    @ManyToOne
    private VideoModel video;
}
