package com.hcl.user.dto;

import com.hcl.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

	
	private long userId;
	private String userName;
	private String email;
	private long departmentId;
	
	
}
