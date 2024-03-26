package org.example;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}



