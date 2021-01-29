package ufv.dis.final2021.MRA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ipsbbdd extends JpaRepository<Customer, Long> {

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}