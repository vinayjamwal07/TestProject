package com.genricExample;


public class Main {

	public static void main(String[] args) {


		/****************************Football***********************************/

		Team<FootballPlayer> csk = new Team<>("Chennai SuperKings");
		FootballPlayer footballPlayer1 = new FootballPlayer("Ronney");
		csk.addPlayer(footballPlayer1);

		
		Team<FootballPlayer> mi = new Team<>("Mumbai Indian");
		FootballPlayer footballPlayer2 = new FootballPlayer("Ronaldo");
		mi.addPlayer(footballPlayer2);

		/****************************BaseBall***********************************/
		
		Team<BaseBallPlayer> newYork = new Team<>("Newyork Yankies");
		BaseBallPlayer baseBallPlayer1 = new BaseBallPlayer("Pat");
		newYork.addPlayer(baseBallPlayer1);

		Team<BaseBallPlayer> canadaBlue = new Team<>("Canada Blues");
		BaseBallPlayer baseBallPlayer2 = new BaseBallPlayer("James");
		canadaBlue.addPlayer(baseBallPlayer2);
		
		/****************************Scoccer***********************************/

		Team<ScoccerPlayer> mnu = new Team<>("Manchester United");
		ScoccerPlayer scoccerPlayer = new ScoccerPlayer("Beckham");
		mnu.addPlayer(scoccerPlayer);

		
		
		// System.out.println(csk.numPlayers());

		csk.matchResult(mi, 5, 3);
		csk.matchResult(mi, 8, 10);
		csk.matchResult(mi, 5, 2);
		
		newYork.matchResult(canadaBlue, 4, 8);
		newYork.matchResult(canadaBlue, 5, 6);
		newYork.matchResult(canadaBlue, 4, 6);
		
		
		System.out.println(csk.getName() + " : " + csk.ranking());
		System.out.println(mi.getName() + " : " + mi.ranking());
		System.out.println(newYork.getName() + " : "+ newYork.ranking());
		System.out.println(canadaBlue.getName() + " : "+canadaBlue.ranking() );
		
		System.out.println(csk.compareTo(mi));
		System.out.println(mi.compareTo(csk));
		
		
		

	}
}
