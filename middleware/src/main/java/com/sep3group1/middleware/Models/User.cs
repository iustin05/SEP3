package middleware.src.main.java.com.sep3group1.middleware.Models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
    @Entity
@Table(name = "users")
public class User {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
        @Size(max = 50)
    private String name;

    @NotBlank
        @Email
    @Size(max = 50)
    private String email;

    @NotBlank
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{8,15}$")
    private String password;

    @Column(name = "access_level")
    @Range(min = 0, max = 2)
    private int accessLevel;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Range(min = 18, max = 100)
    private int age;

}