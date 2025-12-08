package ru.galeofan.watchlist.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@RequiredArgsConstructor
public class DebugConfig {

    private final Environment environment;

    public void print() {
        System.out.println("Active profiles: " + String.join(", ", environment.getActiveProfiles()));
        System.out.println("Server port: " + environment.getProperty("server.port"));
        System.out.println("Custom property: " + environment.getProperty("watchlist.custom"));
    }

}
