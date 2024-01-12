package toysbackspringmysql.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import toysbackspringmysql.entity.ToysEntity;
import toysbackspringmysql.entity.UserLog;
import toysbackspringmysql.repository.ToysRepository;
@Repository
public class ToysDao {
	
	@Autowired
	ToysRepository toyrepo;
	

	public ToysEntity posted(@RequestBody ToysEntity value) {
		 toyrepo.save(value);		 
		 return value;
		 
	}
	
	public ToysEntity login(UserLog custom) {
		 ToysEntity user = toyrepo.findByFirstname(custom.getFirstname());

	    if (user != null && custom.getPassword().equals(user.getPassword())) {
	        
	    	return user;
	    }
	    else {
	    	 user = null;
	   
	}		
	    return user;
	} 

}





