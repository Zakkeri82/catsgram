package ru.yandex.practicum.catsgram.exception;

public class ImageFileException extends Exception {
    public ImageFileException() {
        super();
    }

    public ImageFileException(String message) {
        super(message);
    }

    public ImageFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
