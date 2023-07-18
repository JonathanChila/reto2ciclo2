package com.g6ciclo2reto02.g6ciclo2reto02.Documents;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "usuarios")
public class User implements Serializable {
    public User(Object object, String email2, String password2, String string) {
    }
    @Id
    private Integer id;
    private String identification;  
    private String name;    
    private String address; 
    private String cellPhone;   
    private String email;   
    private String password;    
    private String zone;    
    private String type;
    
    public User(Integer id, String email, String password, String name) {
        this.email = email;
        this.password = password;
    }    
}
