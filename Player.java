package final_pract;

public class Player {
/*
 Write a program in Java to create a player class. Inherit the classes Cricket_player, 
 Football_player and Hockey_player from player class. The 
 * */
	String p_name;
	int p_age;

	Player(String name,int age){
		this.p_name=name;
		this.p_age=age;
		
	}
	
	StringBuffer get_name() {
		return p_name;
	}
	int get_age() {
		return p_age;
	}
}
public class CricketPlayer extends Player {
	String team;
	CricketPlayer(String name,int age,String team){
		super(name,age);
		this.team=team;
	}
	
	public String get_team() {
		return team;
		
	}
	public void play() {
		System.out.println(get_name()+" is playing Cricket with "+get_team());
		
	}
	
	
}

	

