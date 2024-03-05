package db;

import java.util.List;

import model.Person;

public interface PersonDBIF {
	
	List<Person> findAll();
	Person findById(int id);
	boolean update(Person p);
}
