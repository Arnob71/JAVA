package arnob;
//Arnob Laskar
//2012020301
//G
//cse_2012020301@lus.ac.bd
//15/09/2021
public class Cricket extends Sports {
  String matchType;
  int over;
  Player player;
  Cricket(String matchType,int over,String playerName,int jerseyNumber)
  {
	 this.matchType=matchType;
	 this.over=over;
     player=new Player(playerName,jerseyNumber);
  }
  void display()
  {
	  System.out.println("Match type: "+matchType);
	  System.out.println("Over of the match: "+over);
	  System.out.println("Name of player: "+player.playerName);
	  System.out.println("Jersey number of player: "+player.jerseyNumber);
  }

  
}
