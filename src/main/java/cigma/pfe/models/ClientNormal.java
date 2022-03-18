package cigma.pfe.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name="normal_id")

public class ClientNormal extends Client{

    private int importanceLevel;
    public ClientNormal(String name, int importanceLevel) {

        this.importanceLevel = importanceLevel;
    }
}
