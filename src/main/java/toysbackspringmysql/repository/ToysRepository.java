package toysbackspringmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toysbackspringmysql.entity.ToysEntity;

public interface ToysRepository extends JpaRepository<ToysEntity,Integer> {

	 ToysEntity findByFirstname(String firstname);
	
}




