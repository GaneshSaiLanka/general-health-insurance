package com.insurance.generalhealth;

import com.insurance.generalhealth.model.User;
import com.insurance.generalhealth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneralHealthInsuranceManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(GeneralHealthInsuranceManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create initial users
        User user1 = new User();
        user1.setName("John Doe");
        user1.setEmail("john@example.com");
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("Jane Doe");
        user2.setEmail("jane@example.com");
        userRepository.save(user2);
    }
}
