package online.edmond.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        int i = 4;
        System.out.println(i);
        SpringApplication.run(BlogApplication.class, args);
    }

}
