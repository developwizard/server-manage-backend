package com.dewiz.servermanagebackend;

import com.dewiz.servermanagebackend.enumeration.Status;
import com.dewiz.servermanagebackend.model.Server;
import com.dewiz.servermanagebackend.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerManageBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerManageBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepository serverRepository) {
        return args -> {
            serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16GB", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
            serverRepository.save(new Server(null, "192.168.1.58", "Fedora Linux", "16GB", "Dell Tower", "http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
            serverRepository.save(new Server(null, "192.168.1.21", "MS 2008", "32GB", "Web Server", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
            serverRepository.save(new Server(null, "192.168.1.14", "Red Hat Enterprice Linux", "64GB", "Mail Server", "http://localhost:8080/server/image/server4.png", Status.SERVER_DOWN));
        };
    }
}
