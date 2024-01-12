package toysbackspringmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import toysbackspringmysql.entity.ToysEntity;
import toysbackspringmysql.entity.UserLog;
import toysbackspringmysql.service.ToysService;

@RestController
@RequestMapping(value ="/user" )
@CrossOrigin(origins="*")

public class ToysController {
	@Autowired
	ToysService toyser;
	@GetMapping(value = "/msg")
	public String getmsg() {
		return "Hello";
	}
	
	@PostMapping(value="/save")
	public ToysEntity posted(@RequestBody ToysEntity value) {
		return toyser.posted(value);
	}
	
	@PostMapping(value = "/login")
	public ToysEntity checkLogin(@RequestBody UserLog custom) {
		
		return toyser.checkLogin(custom);
		
		
	}

}




