package com.kidzo.auth.payloads;

import lombok.Data;

@Data
public class SignUpDto {
    private String username;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String phoneNumber;
    private String email;
    private String password;
}
