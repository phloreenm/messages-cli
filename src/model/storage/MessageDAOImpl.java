package model.storage;

import java.util.List;

import exceptions.MyException;
import model.dao.MessageDAO;
import model.entities.Message;
import model.entities.User;

/**
 * @author Phlom
 * This class implements methods, from the interface, which methods 
 * transact data with the database.
 */
public class MessageDAOImpl  implements MessageDAO{

	public MessageDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Message sendNewMsg(User sender, User receiver, String msgBody) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> retrieveAllMsgs() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> retrieveMsgsBySender(User sender) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> retieveMsgsByReceiver(User receiver) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMsgByID(int msgID) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMsgByID(int msgID) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMsgBySender(User sender) throws MyException {
		// TODO Auto-generated method stub
		
	}

}
