package modele.persistencelayer.entity;

public class Note {
	private int idNote;
	private String numIns;
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

	public String getNumIns() {
		return numIns;
	}

	public void setNumIns(String numIns) {
		this.numIns = numIns;
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
