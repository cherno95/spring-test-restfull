package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Аннотация для конфигурации Spring Boot приложения
@RestController // Аннотация для объявления класса как REST контроллера
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args); // Запуск Spring приложения
	}
	@GetMapping("/api/hello") // Аннотация для маппинга HTTP GET запросов на метод hello
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}