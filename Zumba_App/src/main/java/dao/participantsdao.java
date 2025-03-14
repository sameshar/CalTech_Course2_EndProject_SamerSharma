package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Participants;
import resource.DBResource;

public class participantsdao {
	
	
	
	public int storeParticipantinfo(Participants participant) {
		
		try {
		Connection con = DBResource.getDbConnection();
		PreparedStatement pstmt1 = con.prepareStatement("insert into participants (name, email, pnumber) values(?,?,?)");	// as string format 
		pstmt1.setString(1, participant.getpname());
		pstmt1.setString(2, participant.getemail());
		pstmt1.setString(3, participant.getpnumber());
		System.out.println("end of try block on participantDAO");
		return pstmt1.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	
	}
