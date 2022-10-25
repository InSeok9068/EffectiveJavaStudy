package kr.co.inseok.D_20221030;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import kr.co.inseok.D_20221030.domain.GenericVO;
import kr.co.inseok.D_20221030.domain.Person;

//슈퍼 타입 토큰에 대한 개념과 간단한 예시
public class QnA {
    public static void main(String[] args) {
        Person person = new ObjectMapper().convertValue(ImmutableMap.<String, Object>builder()
                .put("age", 30)
                .put("gender", "M")
                .put("name", "이인석")
                .build(), Person.class);

        GenericVO<Person> genericPerson = new ObjectMapper().convertValue(ImmutableMap.<String, Object>builder()
                .put("data", ImmutableMap.<String, Object>builder()
                        .put("age", 30)
                        .put("gender", "M")
                        .put("name", "이인석")
                        .build())
                .build(), new TypeReference<GenericVO<Person>>() {
        });

        System.out.println(person);
        System.out.println(genericPerson);
    }
}
