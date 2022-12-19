package com.hcl.user.vo;

import com.hcl.user.dto.Department;
import com.hcl.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@ToString
public class UserDeptVO {
	
	private User user;
	private Department dept;
	
	
	
	

}
