package mybatis.member.vo;

public class Member {

	private int birthmonth;
	private String phone;
	private String regdate;
	private String memberid;
    private String membername;
    private String address;
    private String major;
    private String gender;
	
    // 생성자 선언
    public Member() {
    
    }

	

	public int getBirthmonth() {
		return birthmonth;
	}



	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getRegdate() {
		return regdate;
	}



	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}



	public String getMemberid() {
		return memberid;
	}



	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}



	public String getMembername() {
		return membername;
	}



	public void setMembername(String membername) {
		this.membername = membername;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberid == null) ? 0 : memberid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberid == null) {
			if (other.memberid != null)
				return false;
		} else if (!memberid.equals(other.memberid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [birthmonth=" + birthmonth + ", phone=" + phone + ", regdate=" + regdate + ", memberid="
				+ memberid + ", membername=" + membername + ", address=" + address + ", major=" + major + ", gender="
				+ gender + "]";
	}






}
    

	