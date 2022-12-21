package ex13;

import org.springframework.beans.factory.annotation.Value;

public class Member {
	
	@Value("Park")
	private String name;
	@Value("PPark")
	private String userid;
	@Value("010-1111-1111")
	private String tel;
	
	public void showInfo() {
		System.out.printf("�̸� : %s%n���̵� : %s%n����ó : %s%n", this.getName(), this.getUserid(), this.getTel());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
