package course;

import Subject.SubjectModel;
import lesson.LessonModel;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="course")
@Data
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name = "is_active",nullable = false)
    private Boolean isActive;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date",nullable = false)
    private LocalDate modifyDate;

    @Column(name = "most_viewed")
    private Integer mostViewed;

    @OneToMany(mappedBy = "course")
    private List<SubjectModel> subjects;

    @ManyToOne
    private LessonModel lesson;
}
