package Application.Domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class person {
    
    private String identification;
    private String name;
    private String email;
    private String phoneNumber;
    private string address;
}
