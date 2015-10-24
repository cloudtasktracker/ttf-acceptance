package com.tasktracker.acceptance.operation;

/**
 *
 * Created by joan on 5/7/15.
 */
public enum ApiOperation {
    LIST_TASK("list"),
    GET_TASK("get"),
    ADD_TASK("add"),
    UPDATE_TASK("do"),
    DELETE_TASK("delete");

    private final String operation;

    ApiOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
