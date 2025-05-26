package com.example.autos2.Paidload;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class MessageResponse<T> {
    private String message;
    private T data;
}
