package com.sunday;

import lombok.Getter;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

@Getter
public class ApiResponsebody<T> {
    private final boolean success;
    private final String message;
    private final String timestamp = new Timestamp(System.currentTimeMillis())
            .toLocalDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss+0000"));
    private final T data;

    public ApiResponsebody(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


}
