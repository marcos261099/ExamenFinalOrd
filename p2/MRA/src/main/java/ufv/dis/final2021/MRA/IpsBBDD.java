package ufv.dis.final2021.MRA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IpsBBDD extends JpaRepository<Ipsclase, Long> {
    Ipsclase findByCity_name(Long ip_from);
}