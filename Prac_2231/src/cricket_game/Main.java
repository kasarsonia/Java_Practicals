package cricket_game;

public class Main {

	public static void main(String[] args) {
		Player P1 = new Player(01,"Doni");
		Batsman P2 = new Batsman(02,"Doni", 5);
		Player P3 = new Player(03,"Doni");
		Fielder P4 = new Fielder(04,"Doni");
		Player P5 = new Player(05,"Doni");
		Player P6 = new Player(06,"Doni");
		Bowler P7 = new Bowler(07,"Doni", 50, "SG");
		Player P8 = new Player(8,"Doni");
		Player P9 = new Player(9,"Doni");
		Player P10 = new Player(10,"Doni");
		WicketKeeper P11 = new WicketKeeper(11,"Doni", 10, 7);
		P2.D1();
		P4.D4();
		P7.D2();
		P11.D3();
		Coach C = new Coach("abc");
		Manager M = new Manager("xyz");
		Team t = new Team(P1, C, M);
		t.D5();
		Bails B = new Bails(4);
		Stumps S = new Stumps(6);
		Wicket W = new Wicket(8);
		Crease crease = new Crease(B,S,W);
		crease.D6();
	}

}
