package com.example.accountdemo.dto;

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
}
