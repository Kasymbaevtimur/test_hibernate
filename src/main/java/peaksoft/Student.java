package peaksoft;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String course;
    private String study;

    public Student(String name, String surname, String course, String study) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.study = study;
    }
}
