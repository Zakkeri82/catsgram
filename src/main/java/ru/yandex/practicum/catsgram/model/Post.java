package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode(of = {"id"})
public class Post {

    private Long id;
    private long authorId;
    private String description;
    private Instant postDate;
}