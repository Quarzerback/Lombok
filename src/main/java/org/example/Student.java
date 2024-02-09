package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @With private int id;
    @With private String name;
    @With private String address;
    @With private int grade;

}
