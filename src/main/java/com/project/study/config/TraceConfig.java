package com.project.study.config;

import com.project.study.utils.trace.LocalLogTraceAspect;
import com.project.study.utils.trace.LogTrace;
import com.project.study.utils.trace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TraceConfig {

    @Bean
    @Profile("default")
    public LocalLogTraceAspect localLogTraceAspect(LogTrace logTrace){
        System.out.println("TraceConfig.localLogTraceAspect");
        return new LocalLogTraceAspect(logTrace);
    }


//    @Bean
//    @Profile("prod")
//    public ProdLogTraceAspect prodLogTraceAspect(){
//        System.out.println("TraceConfig.prodLogTraceAspect");
//        return new ProdLogTraceAspect();
//    }


}
