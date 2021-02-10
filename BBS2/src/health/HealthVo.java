package health;

public class HealthVo {
	  private String name;
	   private String email;
	   private String phone;
	   private String gender;
	   private String job;
	   private String lecture;
	public HealthVo() {
		   this("","","","","","");
	}
	 public HealthVo(String name, String email, String phone, String gender,String job,String lecture) {
	      this.name = name;
	      this.email = email;
	      this.phone = phone;
	      this.gender = gender;
	      this.job = job;
	      this.lecture=lecture;
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	
	   
}
