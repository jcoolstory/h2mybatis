package com.postni.h2mybatis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class WebPageNotFundException extends RuntimeException{
    public WebPageNotFundException() {
    }

    public WebPageNotFundException(String message) {
        super(message);
    }

    public WebPageNotFundException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebPageNotFundException(Throwable cause) {
        super(cause);
    }

    public WebPageNotFundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
