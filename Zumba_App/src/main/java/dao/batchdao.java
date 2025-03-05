package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import resource.DBResource;

import org.apache.catalina.realm.UserDatabaseRealm;

import bean.Batch;

public class batchdao {

public List<Batch> viewAllBatch() {
	List<Batch> listOfBatch = new ArrayList<Batch>();
	try {
		Connection con = DBResource.getDBConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from batch");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			//System.out.println("batch id " + rs.getInt(1) + rs.getString(2) + rs.getString(3));
			Batch bb = new Batch();
			bb.setbId(rs.getInt("bid"));
			bb.setWeekday(rs.getString("Weekday"));
			bb.setTime(rs.getString("time"));
			listOfBatch.add(bb);
		}
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	return listOfBatch;
}
	
	}
