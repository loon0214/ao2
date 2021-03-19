package ao2.vo;

import java.util.Date;

public class Project {
	
	private int pj_id;
	private String pj_name;
	private String pj_type;
	private Date reg_date;
	
	public int getPj_id() {
		return pj_id;
	}
	public void setPj_id(int pj_id) {
		this.pj_id = pj_id;
	}
	public String getPj_name() {
		return pj_name;
	}
	public void setPj_name(String pj_name) {
		this.pj_name = pj_name;
	}
	public String getPj_type() {
		return pj_type;
	}
	public void setPj_type(String pj_type) {
		this.pj_type = pj_type;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
