package ufv.dis.final2021.MRA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudWithVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudWithVaadinApplication.class);
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return (args) -> {
            // save customers
            repository.save(new Customer("Diego", "Abad"));
            repository.save(new Customer("Juan", "Rodríguez"));
            repository.save(new Customer("Pedro", "Arranz"));
            repository.save(new Customer("David", "Losada"));
            repository.save(new Customer("Miguel", "Santos"));
            repository.save(new Customer("Antonio", "Wells"));


        };
    }

}