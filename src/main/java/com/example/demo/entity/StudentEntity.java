package.com.example.demo.entity;
import jakarta.persistence.Entity;

@Entity
public class StudentEntity {

 @Id
 @GeneratedValue(strategy=GeneratedValue.IDENTITY)
 private long id;
 private String name;
 private String email;
 private float cgpa;

}