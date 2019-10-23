package com.revature.pojo;

public class StatusForm {
	
	private int RID_status;
	private String manager_stat;
	private String deptHead_stat;
	private String benCo_stat;
	
	public StatusForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusForm(int rID_status, String manager_stat, String deptHead_stat, String benCo_stat) {
		super();
		RID_status = rID_status;
		this.manager_stat = manager_stat;
		this.deptHead_stat = deptHead_stat;
		this.benCo_stat = benCo_stat;
	}

	public int getRID_status() {
		return RID_status;
	}

	public void setRID_status(int rID_status) {
		RID_status = rID_status;
	}

	public String getManager_stat() {
		return manager_stat;
	}

	public void setManager_stat(String manager_stat) {
		this.manager_stat = manager_stat;
	}

	public String getDeptHead_stat() {
		return deptHead_stat;
	}

	public void setDeptHead_stat(String deptHead_stat) {
		this.deptHead_stat = deptHead_stat;
	}

	public String getBenCo_stat() {
		return benCo_stat;
	}

	public void setBenCo_stat(String benCo_stat) {
		this.benCo_stat = benCo_stat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RID_status;
		result = prime * result + ((benCo_stat == null) ? 0 : benCo_stat.hashCode());
		result = prime * result + ((deptHead_stat == null) ? 0 : deptHead_stat.hashCode());
		result = prime * result + ((manager_stat == null) ? 0 : manager_stat.hashCode());
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
		StatusForm other = (StatusForm) obj;
		if (RID_status != other.RID_status)
			return false;
		if (benCo_stat == null) {
			if (other.benCo_stat != null)
				return false;
		} else if (!benCo_stat.equals(other.benCo_stat))
			return false;
		if (deptHead_stat == null) {
			if (other.deptHead_stat != null)
				return false;
		} else if (!deptHead_stat.equals(other.deptHead_stat))
			return false;
		if (manager_stat == null) {
			if (other.manager_stat != null)
				return false;
		} else if (!manager_stat.equals(other.manager_stat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StatusForm [RID_status=" + RID_status + ", manager_stat=" + manager_stat + ", deptHead_stat="
				+ deptHead_stat + ", benCo_stat=" + benCo_stat + "]";
	}
	
	

}
