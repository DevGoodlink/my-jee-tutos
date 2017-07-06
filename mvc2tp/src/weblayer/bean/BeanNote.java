package weblayer.bean;

import java.util.ArrayList;

import modele.persistencelayer.entity.Note;

public class BeanNote {
	private String numIns;
	private ArrayList<Note> notes = new ArrayList<Note>();
	
	public String getNumIns() {
		return numIns;
	}
	public void setNumIns(String numIns) {
		this.numIns = numIns;
	}
	public ArrayList<Note> getNotes() {
		return notes;
	}
	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
	
}
