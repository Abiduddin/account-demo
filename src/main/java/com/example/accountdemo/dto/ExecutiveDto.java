package com.example.accountdemo.dto;

import com.example.accountdemo.model.Customer;
import com.example.accountdemo.model.Executive;
import com.example.accountdemo.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExecutiveDto {

    private long id;

    private long userId;

    private String name;

    private String email;

    private String password;


    private String retypePassword;

    private int typeId;


    public Executive getExecutive() {
        return new Executive(this.getUserId(),
                this.name,
                this.email);
    }

    public User getUser() {
        return new User(1,
                this.getEmail(),
                this.getPassword());
    }
}
