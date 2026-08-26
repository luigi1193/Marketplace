package Application.Domain;

import lombok.Getter;
import lombok.Setter;

import Application.ValueObjects.UserStatus;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

public class User extends person {
    private String username;
    private String password;
    private long userId;
    private UserStatus status;
    private customer customer;
    


    
}
