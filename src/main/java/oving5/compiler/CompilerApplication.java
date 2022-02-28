package oving5.compiler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompilerApplication implements CommandLineRunner {
    private boolean deleteDockerImage=true;

    public static void main(String[] args) {
        SpringApplication.run(CompilerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //console.log.info("DELETE_DOCKER_IMAGE set to : {}", deleteDockerImage);
    }
}
