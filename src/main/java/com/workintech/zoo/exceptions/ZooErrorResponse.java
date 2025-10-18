package com.workintech.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ZooErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    // GETTER METOTLARI
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public long getTimestamp() {
        return timestamp;
    }

    // SETTER METOTLARI
    public void setStatus(int status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}