package toysbackspringmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import toysbackspringmysql.dao.ToysDao;
import toysbackspringmysql.entity.ToysEntity;
import toysbackspringmysql.entity.UserLog;

@Service
public class ToysService {
	@Autowired
	ToysDao toydao;
	
	public ToysEntity posted(@RequestBody ToysEntity value) {
		return toydao.posted(value);
	}
	
	public ToysEntity checkLogin(@RequestBody UserLog custom) {
		return toydao.login(custom);
		
	}
	
}






