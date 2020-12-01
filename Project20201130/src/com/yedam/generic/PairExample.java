package com.yedam.generic;
class Tv{
	
}
class Audio{
	
}

public class PairExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>(); //타입 지정.
		pair.setKind("Hello");
		pair.setModel(1000);
		
		Pair<Tv, String> tv = new Pair<Tv, String>();
		tv.setKind(new Tv());
		tv.setModel("SLM-240");
		
		Pair<Audio, String> audio = new Pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD303");
		
		System.out.println(pair.getKind() + "," + pair.getModel());
	}

}
