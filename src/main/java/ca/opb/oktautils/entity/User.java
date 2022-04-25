package ca.opb.oktautils.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //@Embedded
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    //@Embedded
    @OneToOne(cascade = CascadeType.ALL)
    private Company company;

    public User() {}
}