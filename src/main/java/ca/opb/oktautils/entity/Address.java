package ca.opb.oktautils.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
//@Embeddable
public class Address {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String street;
    private String suite;
    private String city;
    private String zipcode;

  //  @Embedded

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @OneToOne(cascade = CascadeType.ALL)
  private Geo geo;

    public Address() {}
}