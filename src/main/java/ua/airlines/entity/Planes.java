package ua.airlines.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.airlines.entity.enams.PlaneType;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "planes")
public class Planes extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Air_company airCompany;

    @Enumerated(EnumType.STRING)
    private PlaneType planeType;




}
