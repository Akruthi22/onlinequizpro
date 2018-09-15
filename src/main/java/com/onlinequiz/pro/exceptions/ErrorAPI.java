package com.onlinequiz.pro.exceptions;

public class ErrorAPI {
    private String code;
    private String errorDescription;

    public ErrorAPI(String code,String errorDescription){
        this.code=code;
        this.errorDescription=errorDescription;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getErrorDescription(){
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
