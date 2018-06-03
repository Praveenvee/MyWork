
package com.praveenvee.info;

public class info {
	private String id;
	private String FName;
	private String LName;
	private String gender;
	private String branch;
	private String dept;
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return "\n\n-----------MY INFORMATION------------\n\n ID         : "+id+"\n Name       : "+FName+" "+LName+"\n Gender     : "+gender+"\n Branch     : "+branch+"\n Department : "+dept;
	}  
	
}
