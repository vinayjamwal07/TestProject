package com.genricExample;

//Create a generic class to implement a league table for a sport.
//The class should allow teams to be added to the list, and store
//a list of teams that belong to the league.
//
//Your class should have a method to print out the teams in order,
//with the team at the top of the league printed first.
//
//Only teams of the same type should be added to any particular
//instance of the league class - the program should fail to compile
//if an attempt is made to add an incompatible team.

public class MainLeague {
	public static void main(String[] args) {
		
		
		League<TeamLeagueTest<FootballPlayer>> footballLeague = new League<>("Euro Cup");
		TeamLeagueTest<FootballPlayer> manchasterUnited = new TeamLeagueTest<FootballPlayer>("Manchaster United");
		TeamLeagueTest<FootballPlayer> arsenal = new TeamLeagueTest<FootballPlayer>("Aresnal");
		TeamLeagueTest<FootballPlayer> liverPool = new TeamLeagueTest<FootballPlayer>("Liverpool");
		TeamLeagueTest<FootballPlayer> chelsa = new TeamLeagueTest<FootballPlayer>("Chelsa");

		footballLeague.add(manchasterUnited);
		footballLeague.add(arsenal);
		footballLeague.add(liverPool);
		footballLeague.add(chelsa);
	}

}
