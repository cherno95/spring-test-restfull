package com.example.restservice;
import com.example.restservice.request.GetGreetingRq;
import com.example.restservice.request.PostInfoJsonRq;
import com.example.restservice.response.PostInfoJsonRs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControllerJson {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/greeting")
	public GetGreetingRq greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GetGreetingRq(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/api/info")
	public ResponseEntity<PostInfoJsonRs> info(@RequestBody PostInfoJsonRq postInfoJson) {
		PostInfoJsonRs response = new PostInfoJsonRs();
		response.setFirstName(postInfoJson.getFirstName());
		response.setLastName(postInfoJson.getLastName());
		response.setAge(20);
		response.setWork("Home Credit test");
		response.setJob("QA");
		response.setProgrammingLanguages("Java");
		return ResponseEntity.ok(response);
	}
}