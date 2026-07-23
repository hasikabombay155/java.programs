package constructor;
import java.util.Scanner;

public class cricketplayer {
	String playerName;
	int matchesplayed;
	int TotalRuns;
	
	public cricketplayer(String playName, int matchesplayed, int TotalRuns) {
		this.playerName = playName;
		this.matchesplayed= matchesplayed;
		this.TotalRuns = TotalRuns;
		
	}
	public void displayDetails() {
		
		double averageruns = (double) TotalRuns / matchesplayed ;
		
		System.out.println("playerName:"+ playerName );
		System.out.println("matchesplayed:"+ matchesplayed);
		System.out.println("TotalRuns:" + TotalRuns);
		System.out.println("averageruns:" + averageruns);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the playerName");
		String playerName = sc.nextLine();
		
		System.out.println("Enter the matchesplayed");
		int matchesplayed = sc.nextInt();
		
		System.out.println("Enter the TotaRuns");
		int TotalRuns = sc.nextInt();
		
		cricketplayer c = new cricketplayer(playerName,matchesplayed,TotalRuns);
		c. displayDetails();
	}

}
