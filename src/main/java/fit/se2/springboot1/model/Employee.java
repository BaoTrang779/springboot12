package fit.se2.springboot1.model;
import jakarta.persistence.*;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Ename;
    private int age;
    private String image;
    private String address;


}
