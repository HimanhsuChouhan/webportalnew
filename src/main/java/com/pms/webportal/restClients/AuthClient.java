package com.pms.webportal.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.webportal.model.AuthResponse;
import com.pms.webportal.model.UserData;

@FeignClient(name = "authorization-service", url = "http://23pmsauthorizationnew-env.eba-vhmeygx4.ap-south-1.elasticbeanstalk.com")
public interface AuthClient {

	@PostMapping("/login")
	public UserData login(@RequestBody UserData userlogincredentials);

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
