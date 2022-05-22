package model.entities;

import java.util.Date;

public class Message{

	private int msg_id;
	private User sender;
	private User receiver;
	private Date dateSubmitted;
	private String msgBody;
	
	public Message() {
	}
	
	public Message(int msg_id, User sender, User receiver, Date dateSubmitted, String msgBody) {
		super();
		this.msg_id = msg_id;
		this.sender = sender;
		this.receiver = receiver;
		this.dateSubmitted = dateSubmitted;
		this.msgBody = msgBody;
	}

	public int getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	@Override
	public String toString() {
		return "Message [msg_id=" + msg_id + ", sender=" + sender + ", receiver=" + receiver + ", dateSubmitted="
				+ dateSubmitted + ", msgBody=" + msgBody + "]";
	}

}
