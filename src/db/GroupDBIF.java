package db;

import java.util.List;

import model.Group;

public interface GroupDBIF {
	List<Group> findAll();
	Group findById(int id);
	
}
