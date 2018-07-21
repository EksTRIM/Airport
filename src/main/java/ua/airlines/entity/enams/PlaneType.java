package ua.airlines.entity.enams;


        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import ua.airlines.entity.BaseEntity;

        import javax.persistence.Enumerated;

@Getter
@AllArgsConstructor

public enum PlaneType {

    BOEING_737_200("BOEING 737", 200),

    BOEING_777_180("BOEING 777", 180),

    BOEING_A220_190("BOEING A220", 190);

    private String name;
    private int seetsNumber;


    }
