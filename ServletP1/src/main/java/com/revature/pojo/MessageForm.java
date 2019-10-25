package com.revature.pojo;

import java.time.LocalDate;

public class MessageForm {

	private int msg_id;
	private String sender_user;
	private String rec_user;
	private String messages;
	private LocalDate sendDate;
	
	
	public MessageForm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MessageForm(int msg_id, String sender_user, String rec_user, String messages, LocalDate sendDate) {
		super();
		this.msg_id = msg_id;
		this.sender_user = sender_user;
		this.rec_user = rec_user;
		this.messages = messages;
		this.sendDate = sendDate;
	}


	public int getMsg_id() {
		return msg_id;
	}


	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}


	public String getSender_user() {
		return sender_user;
	}


	public void setSender_user(String sender_user) {
		this.sender_user = sender_user;
	}


	public String getRec_user() {
		return rec_user;
	}


	public void setRec_user(String rec_user) {
		this.rec_user = rec_user;
	}


	public String getMessages() {
		return messages;
	}


	public void setMessages(String messages) {
		this.messages = messages;
	}


	public LocalDate getSendDate() {
		return sendDate;
	}


	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + msg_id;
		result = prime * result + ((rec_user == null) ? 0 : rec_user.hashCode());
		result = prime * result + ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result + ((sender_user == null) ? 0 : sender_user.hashCode());
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
		MessageForm other = (MessageForm) obj;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		if (msg_id != other.msg_id)
			return false;
		if (rec_user == null) {
			if (other.rec_user != null)
				return false;
		} else if (!rec_user.equals(other.rec_user))
			return false;
		if (sendDate == null) {
			if (other.sendDate != null)
				return false;
		} else if (!sendDate.equals(other.sendDate))
			return false;
		if (sender_user == null) {
			if (other.sender_user != null)
				return false;
		} else if (!sender_user.equals(other.sender_user))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MessageForm [msg_id=" + msg_id + ", sender_user=" + sender_user + ", rec_user=" + rec_user
				+ ", messages=" + messages + ", sendDate=" + sendDate + "]";
	}
	
	
}
