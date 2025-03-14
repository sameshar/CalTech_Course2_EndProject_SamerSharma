package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		return pstmt1.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	
	public ArrayList<Participants> viewParticipants() {
		
		ArrayList<Participants> participantsList = new ArrayList<Participants>();
		
		try {
			
			Connection con = DBResource.getDbConnection();
			PreparedStatement pstmt2 = con.prepareStatement("select * from participants;");	// as string format 
			ResultSet rs = pstmt2.executeQuery();
			while (rs.next()) {
				Participants prt = new Participants();
				prt.setPid(rs.getString("pid"));
				prt.setpname(rs.getString("name"));
				prt.setemail(rs.getString("email"));
				prt.setpnumber(rs.getString("pnumber"));	
				System.out.println(prt.getPid() + prt.getpnumber());
				participantsList.add(prt);
				participantsList.forEach(fruit -> System.out.println(fruit));
			}
			
			} catch (Exception e) {
				System.err.println(e.toString());
				
			}
		return participantsList;
		
	}
	
	}
