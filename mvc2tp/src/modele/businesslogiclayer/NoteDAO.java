package modele.businesslogiclayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.persistencelayer.*;

import modele.persistencelayer.entity.*;

public class NoteDAO {
	
 public ArrayList<Note> findByNumInsEle(String numIns){
 	ArrayList<Note> notes=new ArrayList<Note>();
 	Connection con=ConnectionUtil.getConnection();
 	try {
		PreparedStatement ps=con.prepareStatement("select * from Note where numIns=?");
		ps.setString(1,numIns);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			Note note=new Note();
			note.setIdNote(rs.getInt("idNote"));
			note.setNumIns(rs.getString("numIns"));
			note.setNomMat(rs.getString("nomMat"));
			note.setNoteMat(rs.getFloat("noteMat"));
			notes.add(note);		
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
 	
 	return notes;
 }
 
}
