package model.dao;

import java.util.List;

import exceptions.MyException;
import model.entities.Message;
import model.entities.User;

public interface MessageDAO {
	
	Message sendNewMsg(User sender, User receiver, String msgBody) throws MyException;  //C.
	
	List<Message> retrieveAllMsgs() throws MyException; 								//R.
	List<Message> retrieveMsgsBySender(User sender) throws MyException;
	List<Message> retieveMsgsByReceiver(User receiver) throws MyException;
	
	void updateMsgByID(int msgID)  throws MyException;									//U.
		
	void deleteMsgByID(int msgID) throws MyException;									//D.
	void deleteMsgBySender(User sender) throws MyException;
	
	
	
}
