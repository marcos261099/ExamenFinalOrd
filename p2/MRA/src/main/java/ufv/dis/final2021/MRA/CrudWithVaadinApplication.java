package ufv.dis.final2021.MRA;

import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SpringBootApplication
public class CrudWithVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

    public CrudWithVaadinApplication(){
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudWithVaadinApplication.class);
    }


    @Bean
    public CommandLineRunner loadData(IpsBBDD repository, IpsBBDD D) throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        Object object = parser.parse(new FileReader("LocalizaIP.json"));
        JsonArray demarcation = (JsonArray) object;

        return (args) -> {
            for (JsonElement demarc : demarcation) {
                Long ip_from = Long.valueOf(((JsonObject) demarc).get("ip_from").getAsString());
                Long ip_to = Long.valueOf(((JsonObject) demarc).get("ip_to").getAsString());
                String country_code = ((JsonObject) demarc).get("country_code").getAsString();
                String country_name = ((JsonObject) demarc).get("country_name").getAsString();
                String region_name = ((JsonObject) demarc).get("region_name").getAsString();
                String city_name = ((JsonObject) demarc).get("city_name").getAsString();
                Double latitude = Double.valueOf(((JsonObject) demarc).get("latitude").getAsString());
                Double longitude = Double.valueOf(((JsonObject) demarc).get("longitude").getAsString());
                String zip_code = ((JsonObject) demarc).get("zip_code").getAsString();
                String time_zone = ((JsonObject) demarc).get("time_zone").getAsString();
                repository.save(new Ipsclase(ip_from,ip_to, country_code,country_name,region_name,city_name,latitude,longitude,zip_code,time_zone));
            }




        };
    }

}