package ua.airlines.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "air_company")
public class Air_company extends BaseEntity{

    @Column(name = "compan_name", length = 150,nullable = false)
    private String companyName;

    @Column(name = "company_address", nullable = false)
    private String companyAddress;

}
