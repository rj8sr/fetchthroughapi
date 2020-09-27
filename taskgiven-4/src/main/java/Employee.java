

import com.fasterxml.jackson.annotation.JsonProperty;

class Employee {
	 @Override
	public String toString() {
		return "Employee [interviewerId=" + interviewerId + ", interviewerName=" + interviewerName
				+ ", getInterviewerEmail=" + getInterviewerEmail + ", interviewerPhone=" + interviewerPhone
				+ ", noOfUnpaidInterview=" + noOfUnpaidInterview + ", totalAmountPending=" + totalAmountPending + "]";
	}


	@JsonProperty("interviewerId")
	private int interviewerId ;
	 @JsonProperty("interviewerName")
    private String interviewerName;
	 @JsonProperty("getInterviewerEmail")
    private String getInterviewerEmail;
	 @JsonProperty("interviewerPhone")
    private String interviewerPhone;
	 @JsonProperty("noOfUnpaidInterview")
    private int noOfUnpaidInterview;
	 @JsonProperty("totalAmountPending")
    private int totalAmountPending;
  

	public int getInterviewerId() {
		return interviewerId;
	}


	public void setInterviewerId(int interviewerId) {
		this.interviewerId = interviewerId;
	}


	public String getInterviewerName() {
		return interviewerName;
	}


	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}


	public String getGetInterviewerEmail() {
		return getInterviewerEmail;
	}


	public void setGetInterviewerEmail(String getInterviewerEmail) {
		this.getInterviewerEmail = getInterviewerEmail;
	}


	public String getInterviewerPhone() {
		return interviewerPhone;
	}


	public void setInterviewerPhone(String interviewerPhone) {
		this.interviewerPhone = interviewerPhone;
	}


	public int getNoOfUnpaidInterview() {
		return noOfUnpaidInterview;
	}


	public void setNoOfUnpaidInterview(int noOfUnpaidInterview) {
		this.noOfUnpaidInterview = noOfUnpaidInterview;
	}


	public int getTotalAmountPending() {
		return totalAmountPending;
	}


	public void setTotalAmountPending(int totalAmountPending) {
		this.totalAmountPending = totalAmountPending;
	}


	public Employee(int Id,String name, String email, String phone, int unpaid,int remain) {
       this.interviewerId=Id;
		this.interviewerName = name;
        this.getInterviewerEmail = email;
        this.interviewerPhone=phone;
        this.noOfUnpaidInterview = unpaid;
        this.totalAmountPending=remain;
    }}