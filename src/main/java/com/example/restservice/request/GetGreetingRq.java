package com.example.restservice.request;

import lombok.AllArgsConstructor;
import lombok.Data;

//Здесь можно обойтись без аннотаций Lombok (@Data, @AllArgsConstructor), если использовать версию 17 Java.
//Также необходимо 'class' заменить на record:
//public record Greeting(long id, String content) { }
//Приложение использует библиотеку Jackson JSON для автоматического преобразования
// экземпляров типа GetGreetingRq в JSON. Jackson по умолчанию включен в веб-стартер.
@Data
@AllArgsConstructor
public class GetGreetingRq {
    private long id;
    private String content;
}