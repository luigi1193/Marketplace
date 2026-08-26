package Application.Domain;

import Application.ValueObjects.CustomerStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class customer extends person {
    private CustomerStatus status;
}
