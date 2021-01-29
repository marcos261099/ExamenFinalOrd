package ufv.dis.final2021.MRA;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileReader;

@SpringBootApplication
public class CrudWithVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudWithVaadinApplication.class);
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return (args) -> {
            JsonParser parser = new JsonParser();
            Object object = parser.parse(new FileReader("LocalizaIP.json"));
            JsonObject gsonObj = (JsonObject) object;
            gsonObj = gsonObj.getAsJsonObject("");
            log.info(gsonObj.toString());




            repository.save(new Customer("Diego", "Abad"));
            repository.save(new Customer("Juan", "Rodríguez"));
            repository.save(new Customer("Pedro", "Arranz"));
            repository.save(new Customer("David", "Losada"));
            repository.save(new Customer("Miguel", "Santos"));
            repository.save(new Customer("Antonio", "Wells"));


        };
    }

}