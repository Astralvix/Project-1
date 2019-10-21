package com.revature.pojo;

public class WelcomeMsg {

	private String welcomeMsg;

	public WelcomeMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WelcomeMsg(String welcomeMsg) {
		super();
		this.welcomeMsg = welcomeMsg;
	}

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((welcomeMsg == null) ? 0 : welcomeMsg.hashCode());
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
		WelcomeMsg other = (WelcomeMsg) obj;
		if (welcomeMsg == null) {
			if (other.welcomeMsg != null)
				return false;
		} else if (!welcomeMsg.equals(other.welcomeMsg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WelcomeMsg [welcomeMsg=" + welcomeMsg + "]";
	}
	
	
}
