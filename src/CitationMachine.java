import java.util.*;

public class CitationMachine {
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[]args) {
		
		//Ask user if they want to continue program
		while(true) {
			//Ask user what citation style they want
			System.out.println("\nWhich citation style would you like to do (mla, apa, chicago)? Enter \"exit\" to quit the program: ");
			String style = reader.nextLine();
			
			if (style.equalsIgnoreCase("exit")) {
				System.out.println("Ok. Exiting the program.");
				System.exit(0);
			}
			//if user types mla
			else if(style.equalsIgnoreCase("mla")) {
				mlaProgram.mla();
			}
			//else if user types apa
			else if(style.equalsIgnoreCase("apa")) {
				apaProgram.apa();
			}
			//else if user types chicago
			else if(style.equalsIgnoreCase("chicago")) {
				chicagoProgram.chicago();
			}
		}
	}
}
