package bean;

public class Participants {
	String pid;
	public String pname;
	String email;
	String pnumber;

//Getters and Setters

	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	public String getpname() {
		return pname;
	}
	public void setpname(String pname) {
		this.pname = pname;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpnumber() {
		return pnumber;
	}
	public void setpnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	
//Constructors
	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}
public Participants(String pid, String pname, String email, String pnumber) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.email = email;
	this.pnumber = pnumber;
}

	


	
	
	
	
}
