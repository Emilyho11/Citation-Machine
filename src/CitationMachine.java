
import java.util.*;

public class CitationMachine {
	static Scanner reader = new Scanner (System.in);
	
	public static String citationStyle() {
		//Ask user what citation style they want
		System.out.println("\nWhich citation style would you like to do (mla, apa, chicago)? Enter \"exit\" to quit the program: ");
		String style = reader.nextLine();
		return style;
	}
	
	public static void main(String[]args) {
		
		//Ask user if they want to continue program
		while(true) {
			String style = citationStyle();
			
			if (style.equalsIgnoreCase("exit")) {
				System.out.println("Ok. Exiting the program.");
				reader.close();
				System.exit(0);
			}
			//if user types mla
			else if(style.equalsIgnoreCase("mla")) {
				mlaProgram mlaCitation = new mlaProgram();
				mlaCitation.instructions();
				mlaCitation.mla();
			}
			//else if user types apa
			else if(style.equalsIgnoreCase("apa")) {
				apaProgram apaCitation = new apaProgram();
				apaCitation.instructions();
				apaCitation.apa();
			}
			//else if user types chicago
			else if(style.equalsIgnoreCase("chicago")) {
				chicagoProgram chicagoCitation = new chicagoProgram();
				chicagoCitation.instructions();
				chicagoCitation.chicago();
			}
		}
	}
}
