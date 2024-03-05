package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.Person;

public class PersonDB implements PersonDBIF {
	private static String findAllQ;
	private static String findByIDQ;
	private static String updateQ;
	private PreparedStatement findAll;
	private PreparedStatement findById;
	private PreparedStatement update;
	

	private Person buildObjectRs(ResultSet rs) {
		return null;
	}

	private List<Person> buildObjectList(ResultSet rs){
		return null;
	}

	@Override
	public List<Person> findAll() {
		return null;
	}

	@Override
	public Person findById(int id) {
		return null;
	}

	@Override
	public boolean update(Person p) {
		return false;
	}

}