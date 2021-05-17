package types;

import java.util.ArrayList;

public class Phrase extends Node{
	ArrayList<Node> children;
	
	public Phrase() {
		
	}
	public Phrase(ArrayList<Node> c) {
		children = c;	
			
	}
	
	public String toString(){
		String rVal = "{";
		for(Node n : children) {
			rVal += n.toString() + ", ";
		}
		rVal = rVal.substring(0, rVal.length()-2) + "}";
		return rVal;
	}
	
	public ArrayList<Node> getChildren(){
		return this.children;
	}
	
	public String getPhraseFromSymbol() {		
		String p = "";
		switch(this.symbol) {
			case 'z': p = "Noun Phrase";break;
			case 'y': p = "Verb Phrase";break;
			case 'v': p = "Adverb Phrase";break;
			case 'w': p = "Adjective Phrase";break;
			case 't': p = "Interjection Phrase";break;
			case 'x': p = "Preposition Phrase";break;
			case 'u': p = "Auxiliary Phrase";break;
			case 's': p = "Sentence";break;
			default : p = "Unknown Phrase type: " + this.symbol;
		}
		return p;
	}
}
