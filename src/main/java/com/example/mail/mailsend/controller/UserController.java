package com.example.mail.mailsend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mail.mailsend.dto.UserDTO;
import com.example.mail.mailsend.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/register")
	public boolean saveDoctor(@RequestBody UserDTO userDTO) {
		System.out.println("dto " + userDTO);
		return userService.regUser(userDTO);
	}
	
	@PostMapping("/gnNum")
	public boolean accAct(@RequestBody int gnNum) {
		System.out.println("num " + gnNum);
		return userService.activatAcc(gnNum);
	}

}
