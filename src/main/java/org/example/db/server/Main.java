package org.example.db.server;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext springApplication = new SpringApplicationBuilder()
                .sources(Main.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
