package modele.businesslogiclayer;


import java.util.Iterator;
import java.util.ArrayList;

import modele.persistencelayer.entity.*;

public class Test {

	public static void main(String[] args) {
		NoteDAO nf=new NoteDAO();
		ArrayList<Note> listeNotes=nf.findByNumInsEle("2009/1");
		
		//boucle for each de java qui intègre un itérateur interne
		for(Note note : listeNotes)
			System.out.println(note.getNomMat()+"  ---  "+ note.getNoteMat());
			
		
		/*
		 * Autre méthode:
		Iterator<Note> it=listeNotes.iterator();
		while(it.hasNext()){
			Note n=(Note)it.next();
			System.out.println(n.getNomMat()+"  ---  "+ n.getNoteMat());
		}
		*/
	}
}
