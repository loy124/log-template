package com.project.study;

import com.project.study.config.TraceConfig;
import com.project.study.utils.trace.LogTrace;
import com.project.study.utils.trace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(TraceConfig.class)
@SpringBootApplication(scanBasePackages = "com.project.study")
public class StudyApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	@Bean
	public LogTrace logTrace(){
		return new ThreadLocalLogTrace();
	}

}
