package com.project.study;

import com.project.config.TraceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import(TraceConfig.class)
@SpringBootApplication(scanBasePackages = "com.project.study")
public class StudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}



}
