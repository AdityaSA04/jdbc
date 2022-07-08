package com.daoimpl;

import java.sql.PreparedStatement;

import com.dao.StudentIntf;
import com.model.Student;
public class Studentimpl implements StudentIntf {
	int row = 0;
	@override
	public int save(Object object) {
		Student s1 = new Student();
		DbConnection db = new DbConnection();
		try {
		PreparedStatement ps = db.getConnection().prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, s1.getStdid());
		ps.setString(2,s1.getStdname());
		ps.setInt(3,s1.getStdmarks());
		row = ps.executeUpdate();
		}catch (Exception e) {e.printStackTrace();}
		return row;
	}	
	
}
