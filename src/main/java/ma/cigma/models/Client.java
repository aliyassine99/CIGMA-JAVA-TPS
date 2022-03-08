package ma.cigma.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {

    private long id;
    private String name;

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client() {

    }
}
