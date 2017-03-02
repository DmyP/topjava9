package ru.javawebinar.topjava.util.exception;

/**
 * User: DmyP
 * Date: 19.02.2017
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
