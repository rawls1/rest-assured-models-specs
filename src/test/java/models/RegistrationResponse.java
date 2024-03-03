package models;

import lombok.Data;

@Data
public class RegistrationResponse {
    private Integer id;
    private String token;
    private String error;
}
