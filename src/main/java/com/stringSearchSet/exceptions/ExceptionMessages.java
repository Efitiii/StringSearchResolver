package com.stringSearchSet.exceptions;

/**
 * @author Efrem  on 4/28/19
 * @project SetContainsString
 */
public enum ExceptionMessages {

    INVALID_SET("Set is not initialized yet."),
    INVALID_STRING_INPUT("Input String is empty.");

    private String message;

    ExceptionMessages(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }
}
