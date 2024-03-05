package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.Group;

public class GroupDB implements GroupDBIF {
	private static String findAllQ;
	private static String findByIdQ;
	private PreparedStatement findAll;
	private PreparedStatement findById;
	
	private Group buildObject(ResultSet rs) {
		return null;
	}
	
	private List<Group> buildObjects(ResultSet rs) {
		return null;
	}

	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
