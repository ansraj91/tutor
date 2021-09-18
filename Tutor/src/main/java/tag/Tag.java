package tag;

import lombok.Data;
import video.VideoModel;

import javax.persistence.*;

@Entity
@Table(name = "tag")
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    private VideoModel video;
}
