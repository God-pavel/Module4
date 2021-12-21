package com.mentoring.one;

import com.netflix.discovery.EurekaClient;
import com.netflix.servo.monitor.BasicInformational;
import com.netflix.servo.monitor.MonitorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/one")
public class GreetingController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/greeting")
    public String greeting() {
        return String.format(
                "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
    @GetMapping("/info")
    public String info() {
        BasicInformational informational = new BasicInformational(
                MonitorConfig.builder("test").build());
        informational.setValue("information collected");
        return informational.getValue();
    }
}