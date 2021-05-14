package com.project.workout.vo;

public class ResponseVO<T> {
    private int code;
    private T Data;
    private String msg;

    public ResponseVO(int code, T data, String msg) {
        this.code = code;
        Data = data;
        this.msg = msg;
    }

    public ResponseVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseVO(int code, T data) {
        this.code = code;
        Data = data;
    }
    public ResponseVO(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
