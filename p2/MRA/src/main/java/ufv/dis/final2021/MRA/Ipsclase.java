package ufv.dis.final2021.MRA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ipsclase {

    @Id
    @GeneratedValue
    private Long id;

    private Long ip_from;

    private Long ip_to;

    @Column(length=2)
    private String country_code;

    @Column(length=64)
    private String country_name;

    @Column(length=128)
    private String region_name;

    @Column(length=128)
    private String city_name;

    private Double latitude;

    private Double longitude;

    @Column(length=30)
    private String zip_code;

    @Column(length=8)
    private String time_zone;

    protected Ipsclase() {
    }

    public Ipsclase(Long ip_from, Long ip_to, String country_code, String country_name, String region_name, String city_name, Double latitude, Double longitude, String zip_code, String time_zone) {
    this.ip_from=ip_from;
    this.ip_to=ip_to;
    this.country_code=country_code;
    this.country_name=country_name;
    this.region_name=region_name;
    this.city_name=city_name;
    this.latitude=latitude;
    this.longitude=longitude;
    this.zip_code=zip_code;
    this.time_zone=time_zone;
    }


}