package modele.persistencelayer.entity;

public class Note {
	private int idNote;
	private String numInsEle;
	private String nomMat;
	private float noteMat;

	
	
	public Note() {
		super();
	}

	public int getIdNote() {
		return idNote;
	}

	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}

	public String getNumInsEle() {
		return numInsEle;
	}

	public void setNumInsEle(String numInsEle) {
		this.numInsEle = numInsEle;
	}
	
	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public float getNoteMat() {
		return noteMat;
	}

	public void setNoteMat(float noteMat) {
		this.noteMat = noteMat;
	}	
}
