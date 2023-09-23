package com.github.juliherms.todo.response;

import lombok.Data;

@Data
public class SuccessDataResponse <T> extends Response {

    private T data;

    public SuccessDataResponse(T data) {
        super(true);
        this.data = data;
    }
}
