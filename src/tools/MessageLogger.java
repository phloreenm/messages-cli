package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import model.entities.Message;

/*import java.io.File;
import java.io.FileWriter;

import entity.Message;*/

/**
 * @author Phlom
 * This class logs every sent message to a log file, appending every new message 
 * to the file. Can be seen by the Super-Admin user only.
 */
public class MessageLogger {  

	public void logTheMessage(Message msg) {
		FileWriter fileWriter = null;
		File file = new File("./bin/logs/messages.log");
		try {
			fileWriter = new FileWriter(file, true);
			PrintWriter printToFile = new PrintWriter(fileWriter);
			
			int msgId = msg.getMsg_id();
			String sSender = msg.getSender().getUsername();
			String rReceiver = msg.getReceiver().getUsername();
			Date subDate = msg.getDateSubmitted();
			String msgBody = msg.getMsgBody();
			
			printToFile.append(System.getProperty("line.separator"));
			printToFile.append(String.format(""));
			//printToFile.append(String.format("%27s", "Messages Report from all the Database"));
			printToFile.append(System.getProperty("line.separator"));
			//printToFile.append(String.format(""));
			//printToFile.append(System.getProperty( "line.separator"));
			fileWriter.append("\n--------| Message ID \'" + msgId + "\'| --------------------------------------------------------------------------------------------------------------------------------");
			printToFile.append(System.getProperty("line.separator"));
			printToFile.append(String.format("%-4s %-10s %-10s %-35s %-10s", "| ID", "| From","| To","| Submission Date","| Message body"));
			printToFile.append(System.getProperty("line.separator"));
			printToFile.append(String.format(""));
			printToFile.append(System.getProperty("line.separator"));

			//Print on console the msgs:
			System.out.println("\n");
			System.out.printf("%-4s %-10s %-10s %-35s %-10s","ID", "| From","| To","| Submission Date","| Message body");
			System.out.print("\n");
			System.out.printf("%-4s %-10s %-10s %-35s %-10s", "| " + msgId, "| " + sSender, "| " + rReceiver, "| " + subDate, "| " + msgBody);

			//Here is appends new messages

			fileWriter.append(String.format("%-4s %-10s %-10s %-35s %-10s", "| " + msgId, "| " + sSender, "| " + rReceiver, "| " + subDate, "| " + msgBody));
			fileWriter.append("\n----------------------------------------------------------------------------------------------------------------------------------------------------------");
			fileWriter.append(System.getProperty("line.separator"));
			
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException  y) {
			System.out.println("File can't be find or file couldn't be written.");
			y.printStackTrace();
		} catch (NullPointerException x) {
			System.out.println("Log file can't be find at that location.");
			x.printStackTrace();
		}
		System.out.println("Backing-up of sent message was succesful! Read log file to see the sent messages.");
	}
	/*	private FileWriter writer;
	public static final FileWriter
	public MessageLogger() {
	}
	//open the file or crete it if not found
	public void initFile() {
	}
	public void writeToFile(Message message) {
	}*/

}


/*
 * 
 public void viewAllMessagesAdmin() {
		String query = "SELECT * FROM connecting_people.message";

		try {

			PrintWriter writer = new PrintWriter(new FileWriter("messages.txt",true));
			writer.append(System.getProperty( "line.separator" ));
			writer.append(String.format(""));
			writer.append(String.format("%27s", "Messages Report from all the Database"));
			writer.append(System.getProperty( "line.separator" ));
			writer.append(String.format(""));
			writer.append(System.getProperty( "line.separator" ));
			writer.append(String.format("%-25s %-13s %-15s %-15s ", "Date of submission", "Sender", "Receiver","Message Data"));
			writer.append(System.getProperty( "line.separator" ));
			writer.append(String.format(""));
			writer.append(System.getProperty( "line.separator" ));

			stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				int id_message=rs.getInt("id_message");						
				String date = rs.getString("date").substring(0, 19);
				String sender = rs.getString("sender");
				String receiver = rs.getString("receiver");
				String data = rs.getString("data");

				System.out.println("\n");
				System.out.printf("%-30s %-18s %-20s %-20s", "Date of submission", "Sender", "Receiver","Message Id");
				System.out.print("\n");
				System.out.printf("%-30s %-18s %-20s %-20s", date, sender, receiver,id_message);
				System.out.print("\n");
				System.out.println("\n\nMessage Data: ");
				System.out.print("\n");
				System.out.println(data);
				System.out.println("\n\n--------------------------------------------------------------------------------------------------------");

				writer.append(String.format("%-25s %-13s %-15s %-15s ", date, sender, receiver, data));
				writer.append(System.getProperty( "line.separator" ));

			}
			writer.close();
		} catch (SQLException | IOException  se) {
			se.printStackTrace();

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
 */

/*
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Log {
	//static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
	public Log() {}
	public static void appendStrToFile(String fileName,String str) { 
		try { 
			// Open given file in append mode. 

			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true)); 

			out.write(str); 
			out.newLine();
			out.newLine();
			out.close(); 
			} 
		catch (Exception e) {
			e.printStackTrace(); 
		}
	} 
}
 */
