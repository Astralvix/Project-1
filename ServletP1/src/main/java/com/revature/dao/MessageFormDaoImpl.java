package com.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.MessageForm;
import com.revature.util.ConnectionFactory;

public class MessageFormDaoImpl implements MessageFormDao{
	
private Connection conn = ConnectionFactory.getConnection();
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void createMsgForm(MessageForm msgForm) {
		// TODO Auto-generated method stub
		String sql = "insert into project1.message (sender_user,rec_user,messages,date_sent) values(?,?,?,?);";
		PreparedStatement stmt;
		LocalDate today = LocalDate.now();
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, msgForm.getSender_user());
			stmt.setString(2, msgForm.getRec_user());
			stmt.setString(3, msgForm.getMessages());
			stmt.setDate(4, Date.valueOf(today));
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<MessageForm> getMyMsg(String rec_username) {
		// TODO Auto-generated method stub
		String sql = "select * from project1.message where rec_user = ?;";
		PreparedStatement stmt;
		List<MessageForm> msgForm = new ArrayList<MessageForm>();
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, rec_username);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				MessageForm msg = new MessageForm();
				msg.setMsg_id(rs.getInt(1));
				msg.setSender_user(rs.getString(2));
				msg.setRec_user(rs.getString(3));
				msg.setMessages(rs.getString(4));
				msg.setSendDate(rs.getDate(5).toLocalDate());
				msgForm.add(msg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msgForm;
	}

}
