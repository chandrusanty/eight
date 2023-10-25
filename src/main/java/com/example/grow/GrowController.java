package com.example.grow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrowController {
@GetMapping("/ecb")
public String getecb() {
	return "eoin";
}
}
