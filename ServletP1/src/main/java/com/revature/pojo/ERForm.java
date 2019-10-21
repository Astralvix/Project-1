package com.revature.pojo;

import java.time.LocalDate;


public class ERForm {
	
	//Reimbursement ID
    private int RID;
    private String userName;
    private String fullName;
    private LocalDate theDate;
    private LocalDate eventStartDate;
    private String theLocation;
    private String description;
    private double theCost;
    private String gradingFormat;
    private String passingPercentage;
    private String eventType;
    private String reason;
    private String fileName; 
    private String status;
	
    public ERForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ERForm(int rID, String userName, String fullName, LocalDate theDate, LocalDate eventStartDate,
			String theLocation, String description, double theCost, String gradingFormat, String passingPercentage,
			String eventType, String reason, String fileName, String status) {
		super();
		RID = rID;
		this.userName = userName;
		this.fullName = fullName;
		this.theDate = theDate;
		this.eventStartDate = eventStartDate;
		this.theLocation = theLocation;
		this.description = description;
		this.theCost = theCost;
		this.gradingFormat = gradingFormat;
		this.passingPercentage = passingPercentage;
		this.eventType = eventType;
		this.reason = reason;
		this.fileName = fileName;
		this.status = status;
	}



	public int getRID() {
		return RID;
	}

	public void setRID(int rID) {
		RID = rID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	

	public LocalDate getTheDate() {
		return theDate;
	}



	public void setTheDate(LocalDate theDate) {
		this.theDate = theDate;
	}



	public LocalDate getEventStartDate() {
		return eventStartDate;
	}



	public void setEventStartDate(LocalDate eventStartDate) {
		this.eventStartDate = eventStartDate;
	}


	public String getTheLocation() {
		return theLocation;
	}

	public void setTheLocation(String theLocation) {
		this.theLocation = theLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTheCost() {
		return theCost;
	}

	public void setTheCost(double theCost) {
		this.theCost = theCost;
	}

	public String getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}

	public String getPassingPercentage() {
		return passingPercentage;
	}

	public void setPassingPercentage(String passingPercentage) {
		this.passingPercentage = passingPercentage;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RID;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((eventStartDate == null) ? 0 : eventStartDate.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((gradingFormat == null) ? 0 : gradingFormat.hashCode());
		result = prime * result + ((passingPercentage == null) ? 0 : passingPercentage.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		long temp;
		temp = Double.doubleToLongBits(theCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((theDate == null) ? 0 : theDate.hashCode());
		result = prime * result + ((theLocation == null) ? 0 : theLocation.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		ERForm other = (ERForm) obj;
		if (RID != other.RID)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventStartDate == null) {
			if (other.eventStartDate != null)
				return false;
		} else if (!eventStartDate.equals(other.eventStartDate))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (gradingFormat == null) {
			if (other.gradingFormat != null)
				return false;
		} else if (!gradingFormat.equals(other.gradingFormat))
			return false;
		if (passingPercentage == null) {
			if (other.passingPercentage != null)
				return false;
		} else if (!passingPercentage.equals(other.passingPercentage))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (Double.doubleToLongBits(theCost) != Double.doubleToLongBits(other.theCost))
			return false;
		if (theDate == null) {
			if (other.theDate != null)
				return false;
		} else if (!theDate.equals(other.theDate))
			return false;
		if (theLocation == null) {
			if (other.theLocation != null)
				return false;
		} else if (!theLocation.equals(other.theLocation))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "ERForm [RID=" + RID + ", userName=" + userName + ", fullName=" + fullName + ", theDate=" + theDate
				+ ", eventStartDate=" + eventStartDate + ", theLocation=" + theLocation + ", description=" + description
				+ ", theCost=" + theCost + ", gradingFormat=" + gradingFormat + ", passingPercentage="
				+ passingPercentage + ", eventType=" + eventType + ", reason=" + reason + ", fileName=" + fileName
				+ ", status=" + status + "]";
	}

	
    
    
    
}
