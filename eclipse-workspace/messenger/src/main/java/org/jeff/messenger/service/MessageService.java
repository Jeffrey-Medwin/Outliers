package org.jeff.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.jeff.messenger.module.Message;
public class MessageService {
	
	public List<Message> getAllMessages() {
		Message jeffMessage = new Message("Hi! Its REST", "Jeffrey");
		Message sanjayMessage = new Message("It's Tutorial", "Sanjay");
		List<Message> list = new ArrayList<>();
		list.add(jeffMessage);
		list.add(sanjayMessage);
		return list;
	}
}
