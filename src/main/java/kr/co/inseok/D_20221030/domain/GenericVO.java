package kr.co.inseok.D_20221030.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class GenericVO<T> {
    T data;

    @Builder
    public GenericVO(T data) {
        this.data = data;
    }
}
