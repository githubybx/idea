package com.example.demo.StatueCode;

public enum StatueCode {
    Success(200, "success"),
    Failed(100, "failed"),
    Valied(320, "valied"),
    NotLogin(390, "not login");
    int code;
    String msg;

    StatueCode() {

    }

    StatueCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
