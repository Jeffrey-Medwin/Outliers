package org.jeff.messenger.module;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private String message;
	private String senderName;

	public Message() {}    /// no up constructor
	
	public Message(String message, String senderName) {
		this.message = message;
		this.senderName = senderName;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSenderName() {
		return senderName;
	}
	
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
}
