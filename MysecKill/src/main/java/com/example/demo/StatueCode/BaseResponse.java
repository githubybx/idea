package com.example.demo.StatueCode;

public class BaseResponse<T> {
    int code;
    String msg;
    T data;

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse() {
    }

    public BaseResponse(StatueCode statueCode) {
        this.code = statueCode.code;
        this.msg = statueCode.msg;
    }

    public BaseResponse(StatueCode statueCode, T data) {
        this.code = statueCode.code;
        this.msg = statueCode.msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
