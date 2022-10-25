package kr.co.inseok.D_20221030.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Person {
    private int age;
    private String gender;
    private String name;

    @Builder
    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
}
