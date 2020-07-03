package com.example.mail.mailsend.service;

import com.example.mail.mailsend.dto.UserDTO;

public interface UserService {

	public boolean regUser(UserDTO userDTO);
	public boolean activatAcc(int gnNumber);

}
