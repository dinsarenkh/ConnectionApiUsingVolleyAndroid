package com.dinsaren.connectionapiusingvolleyandroid.models;

import java.util.List;

public class Data {

    private String code;

    private List<Category> data;

    private String message;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setData(List<Category> data) {
        this.data = data;
    }

    public List<Category> getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return
                "Data{" +
                        "code = '" + code + '\'' +
                        ",data = '" + data + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }
}