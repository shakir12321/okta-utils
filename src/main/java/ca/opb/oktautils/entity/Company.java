package ca.opb.oktautils.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
//@Embeddable
public class Company {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column( name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;

    public Company() {}
}