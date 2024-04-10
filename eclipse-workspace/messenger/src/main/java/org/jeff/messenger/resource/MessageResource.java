package org.jeff.messenger.resource;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.jeff.messenger.module.Message;
import org.jeff.messenger.service.MessageService;


@Path("/messages")
public class MessageResource {
	
	MessageService messageResource = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return messageResource.getAllMessages();
	}
}