package edu.cj.javase.day0713.work;

public class Player {

	public void play(Instrument ins){
		ins.play();
	}
	public static void main(String[] args) {
		Instrument p = new Piano();
		Player tom = new Player();
		tom.play(p);
		Instrument p2 = new Sax();
		tom.play(p2);
	}

}
