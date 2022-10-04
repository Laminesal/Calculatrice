package fr.ajc.spring.web.pendu.model;

public class EssaiPendu {

	private String word;
	private Integer errors;
	private Boolean win;

	public EssaiPendu() {

	}

	public EssaiPendu(String word, Integer errors, Boolean win) {
		super();
		this.word = word;
		this.errors = errors;
		this.win = win;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getErrors() {
		return errors;
	}

	public void setErrors(Integer errors) {
		this.errors = errors;
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}

}
