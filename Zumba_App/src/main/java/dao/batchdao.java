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
			Connection con = DBResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from batch;");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("batch id " + rs.getInt(1) + rs.getString(2) + rs.getString(3));
				Batch bb = new Batch();
				bb.setbId(rs.getString("bid"));
				bb.setWeekday(rs.getString("weekday"));
				bb.setTime(rs.getString("time"));
				listOfBatch.add(bb);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return listOfBatch;
	}

public int storeBatchinfo(Batch batch) {
	
	try {
	Connection con = DBResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("insert into batch values(?,?,?)");	// as string format 
	pstmt.setString(1, batch.getbId());
	pstmt.setString(2, batch.getWeekday());
	pstmt.setString(3, batch.getTime());
	return pstmt.executeUpdate();
	} catch (Exception e) {
		System.err.println(e.toString());
		return 0;
	}
}
}
