package com.example.mavenproject1.Designpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class StudentDAO {
//	private ResultSet performquery(String query) {
//		
//	}
	
	public List <StudentDTO> getallstudents() throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select *from student");
		
		ResultSet rs=ps.executeQuery();//rs point bof(begging of file-first record)
		//object relation mapping
		List<StudentDTO> l1=new ArrayList<>();
		ResultSetMetaData rm=rs.getMetaData();
		System.out.println(rm.getColumnCount());
		int c=rm.getColumnCount();
		for(int i=1;i<=c;i++) {
			System.out.println(rm.getColumnName(i)+" "+rm.getColumnType(i));
		}
		while(rs.next()) { 
			l1.add(new StudentDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			
		}
		return l1;
		
	}
	public StudentDTO getbyid(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("select *from student where sroll=?");
		ps.setInt(1,ob.getSroll());
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			ob.setFirstname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setDob(rs.getString(4));
			ob.setGender(rs.getString(5));
			
		}
		else {
			throw new Exception("sroll"+ob.getSroll()+" doesnot exist");
		
		}
		return ob;
		
	}
	public int insert(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setInt(1,ob.getSroll());
		ps.setString(2, ob.getFirstname());
		ps.setString(3,ob.getLname());
		ps.setString(4, ob.getDob());
		ps.setString(5, ob.getGender());
		int rs=ps.executeUpdate();	
//		if(rs.next()) {
//			ob.setSroll(rs.getInt(1));
//			ob.setFirstname(rs.getString(2));
//			ob.setLname(rs.getString(3));
//			ob.setDob(rs.getString(4));
//			ob.setGender(rs.getString(5));
//			
//		}
//		else {
//			throw new Exception("cannot insert value");
//		
//		}
		return rs;
		
	}
	public int deletebyId(StudentDTO ob) throws Exception{
		Connection con=Dbconnector.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from student where Sroll=?");
		ps.setInt(1,ob.getSroll());
		int rs =ps.executeUpdate();
		return rs;
		
		
	}
	

}
