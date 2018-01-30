package bitchbot.backend.app.domain;

import lombok.Data;

@Data
public class Input {
	private String text;
	
	private String poem;
	
	public Input(String text,String poem)  {
		this.text = text;
		this.poem = poem;
	}
	
	public Input()  {
	}
	
	public Input(String poem) {
		this.poem = poem;
		this.text = null;
	}
}
