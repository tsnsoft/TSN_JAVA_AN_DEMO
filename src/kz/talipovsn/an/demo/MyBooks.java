package kz.talipovsn.an.demo;

import lombok.Data;

// Пример класса с аннотацией @Data, которая неявно создает геттеры и сеттеры
@Data
public class MyBooks {

    private int year; 
    private String title;
    private String author;

    public MyBooks(int year, String title, String author) {
        this.year = year;
        this.title = title;
        this.author = author;
    }
}
