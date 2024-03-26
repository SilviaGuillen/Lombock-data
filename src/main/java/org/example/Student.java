package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Student {
    private int id;
    private String name;
    private String address;
    private char grade;

    public Object withName(String anette) {
        return null;
    }

}
















