package com.ha.football;

public class League {

	public static void main(String[] args) {
		//Object creation
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		Player p5=new Player();
		Player p6=new Player();
		
		Team team1=new Team();
		Team team2=new Team();
		
		//Data creation
		p1.playerName="Lionel Messi";
		p2.playerName="Cristiano Ronaldo";
		p3.playerName="Neymar da Silva Santos Júnior";
		p4.playerName="Mo Sallah";
		p5.playerName="Robert Lewandowski";
		p6.playerName="Sadio Mané ";
		team1.teamName="Barcelona FC";
		team2.teamName="Real Madrid";
		
		
		//Creating player Array object
		Player[] playerarray1=new Player[3];
		Player[] playerarray2=new Player[3];
		
		//Create player array 
		playerarray1[0]=p4;
		playerarray2[0]=p1;
		playerarray1[1]=p2;
		playerarray2[1]=p3;
		playerarray1[2]=p5;
		playerarray2[2]=p6;
		
		//assign player array to team
		team1.playerArray=playerarray1;
		team2.playerArray=playerarray2;
		
		//System.out.println(team1.playerArray);
		//System.out.println(team2.playerArray);
		
		System.out.println("Team 1 -->"+team1.teamName);
		System.out.println("all the palyers of "+team1.teamName+" are-->");
		
		for(Player S:team1.playerArray) {
			System.out.println(S.playerName);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("Team 2-->"+team2.teamName);
		System.out.println("all the palyers of "+team2.teamName+" are-->");
		
		for(Player S:team2.playerArray) {
			System.out.println(S.playerName);
		}
		
		
	}

}
