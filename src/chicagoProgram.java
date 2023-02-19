
import java.util.*;

public class chicagoProgram extends AllProgramMethods {
	Scanner reader = CitationMachine.reader;
	
	// Constructor
	public chicagoProgram() {
	}
	
	public void instructions() {
		//Instructions to format the Chicago page
		System.out.println("Chicago Instructions:");
		System.out.println("- Create a separate page titled: Bibliography");
		System.out.println("- Center the title.");
		System.out.println("- All Words: size 12, font 'Times New Roman'.");
		System.out.println("- Single space everything.");
		System.out.println("- Starting from the second line of every source needs to be indented.");
		System.out.println("- Put all sources in alphabetical order and do not number the sources.\n");
		System.out.println("Instructions for Footnotes.");
		System.out.println("- All Footnotes go at the bottom of the page with your research.");
		System.out.println("- Only the first line of each source is indented (press TAB).");
		System.out.println("- Number your sources according to where you used the notes in your writing.");
		System.out.println("- All Words: size 12, font 'Times New Roman'.");
		System.out.println("- Single space everything, no spaces in between sources.");
		System.out.println("- If the same source is used right after the same footnote and only the page number is different, write: Ibid., page number.");
		System.out.println("- If the source and page are the same as the previous footnote, write: Ibid.\n");
	}
	
	public String sourceType() {
		System.out.println("What source do you want to cite (website, book)? Enter \"exit\" to quit: ");
		String source = reader.nextLine();
		return source;
	}
	
	// Check if website is an encyclopedia
	public String checkEncyclopedia() {
		System.out.println("Is the website an Encyclopedia (yes or no)? Enter \"exit\" to go back: ");
		String webType = reader.nextLine();
		webType.toLowerCase();
		return webType;
	}
	
	public void website() {
		String check = checkEncyclopedia();
		// If user wants to go back, ask again what sourceType user is citing (by calling chicago())
		if(check.equalsIgnoreCase("exit")) {
			chicago();
		}
		//If website is an Encyclopedia, cite it in Encyclopedia format
		else if (check.equalsIgnoreCase("yes")) {
			//Ask for the Chicago requirements (Author's last name, First name, title of website...);
			System.out.print("Enter Author's first name: ");
			String firstName = reader.nextLine();
			
			System.out.print("Enter Author's last name: ");
			String lastName = reader.nextLine();
			
			System.out.print("Enter title of article: ");
			String title = reader.nextLine();
			
			System.out.print("Enter name of Encyclopedia: ");
			String encyclopediaName = reader.nextLine();
			
			System.out.print("Enter City of publishing: ");
			String cityPublished = reader.nextLine();
			
			System.out.print("Enter Publishing Company: ");
			String publishingCompany= reader.nextLine();
			
			System.out.print("Enter copyrigyht: ");
			String copyright = reader.nextLine();
			
			System.out.print("Enter the page number that you used: ");
			String usedPage = reader.nextLine();
			
			System.out.println("\nCiting now...\n");
			
			System.out.println("Citation for the bibliography page:");
			System.out.println(lastName + ", " + firstName + ". \"" + title + ".\" " + encyclopediaName + 
								". " + cityPublished + ": " + publishingCompany + ", " + copyright + ".");
			
			System.out.println("");
			System.out.println("\nCitation for the Footnote/Endnote:");
			System.out.println(firstName + (" ") + lastName + ". \"" + title + ".\" " + encyclopediaName + 
								" (" + cityPublished + ": " + publishingCompany + ", " + copyright + "), " + usedPage + ".");
			return;
		}
		
		//If website is not an Encyclopedia, Cite it in website format
		else if(check.equalsIgnoreCase("no")){
			//Ask for the Chicago requirements (Author's last name, First name, title of website...);
			System.out.print("Enter Author's first name (If there isn't one, write 'n/a'): ");
			String webFirstName = reader.nextLine();
			
			String webLastName = null;
			if(!webFirstName.equalsIgnoreCase("n/a")) {
				System.out.print("Enter Author's last name (If there isn't one, write 'n/a'): ");
				webLastName = reader.nextLine();
			}
			
			System.out.print("Enter title of article: ");
			String webTitle = reader.nextLine();
			
			System.out.print("Enter the Website Company Name: ");
			String webCompanyName = reader.nextLine();
			
			System.out.print("Enter URL: ");
			String URL = reader.nextLine();
			
			System.out.print("Enter date you accessed the website (Ex: January 29, 2020): ");
			String accessedDate = reader.nextLine();
			
			System.out.println("\nCiting now...\n");
			
			// Chicago Website Citation
			// If website has no author
			if(webFirstName.equalsIgnoreCase("n/a") || webLastName.equalsIgnoreCase("n/a")) {
				System.out.println("Citation for the bibliography page:");
				System.out.println(webCompanyName + ". \"" + webTitle + ".\" " + URL + " (accessed " + 
						accessedDate + ").");
			
				System.out.println("\nCitation for the Footnote/Endnote:");
				System.out.println(webCompanyName + ", \"" + webTitle + ".\" " + URL + " (accessed " + 
						accessedDate + ").");
				return;
			}
			
			// If website has an author
			else {
				System.out.println("Citation for the bibliography page:");
				System.out.println(webLastName + ", " + webFirstName + ". \"" + webTitle + ".\" " + 
						webCompanyName + ", " + URL + " (accessed " + accessedDate + ").");
				
				System.out.println("\nCitation for the Footnote/Endnote:");
				System.out.println(webFirstName + " " + webLastName + ", \"" + webTitle + ".\" " +
						webCompanyName + ", " + URL + " (accessed " + accessedDate + ").");
				return;
			}
		}
	}
	
	public void bookCorporate() {
	}
	
	public void book1Author() {
		System.out.println("Enter Author's first name: ");
		String firstName = reader.nextLine();
		
		System.out.println("Enter Author's last name: ");
		String lastName = reader.nextLine();
		
		System.out.print("Enter Title of Book: ");
		String title = reader.nextLine();
		
		System.out.print("Enter the city of publishing: ");
		String cityPublished = reader.nextLine();
		
		System.out.print("Enter the Publishing Company: ");
		String publishingCompany = reader.nextLine();
		
		System.out.print("Enter the copyright: ");
		String copyright = reader.nextLine();
		
		System.out.print("Enter the page number that you used: ");
		String usedPage = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		//Cite Book in Chicago format (Bibliography)
		System.out.println("Here is the citation for the bibliography page:");
		System.out.println(lastName + ", " + firstName + ". " + title + ". " + cityPublished + ": " + 
							publishingCompany + ", " + copyright + ".");
		
		System.out.println("");
		//Cite Book in Chicago format (Footnote/Endnote)
		System.out.println("\nHere is the citation for the Footnote/Endnote:");
		System.out.println(firstName + " " + lastName + ", " + title + " (" + cityPublished + ": " + 
							publishingCompany + ", " + copyright + "), " + usedPage + ".");
		return;
	}
	public void book2Authors() {
		System.out.println("Enter first name of Author 1: ");
		String firstName = reader.nextLine();
		
		System.out.println("Enter last name of Author 1: ");
		String lastName = reader.nextLine();
		
		System.out.println("Enter first name of Author 2: ");
		String firstName2 = reader.nextLine();
		
		System.out.println("Enter last name of Author 2: ");
		String lastName2 = reader.nextLine();
		
		System.out.print("Enter Title of Book: ");
		String title = reader.nextLine();
		
		System.out.print("Enter the city of publishing: ");
		String cityPublished = reader.nextLine();
		
		System.out.print("Enter the Publishing Company: ");
		String publishingCompany = reader.nextLine();
		
		System.out.print("Enter the copyright: ");
		String copyright = reader.nextLine();
		
		System.out.print("Enter the page number that you used: ");
		String usedPage = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		//Cite Book in Chicago format (Bibliography)
		System.out.println("Here is the citation for the bibliography page:");
		System.out.println(lastName + ", " + firstName + " and " + firstName2 + " " + lastName2 + 
							". " + title + ". " + cityPublished + ": " + publishingCompany + ", " + copyright + ".");
		
		System.out.println("");
		//Cite Book in Chicago format (Footnote/Endnote)
		System.out.println("\nHere is the citation for the Footnote/Endnote:");
		System.out.println(lastName + " and " + lastName2 + ", " + title + " (" + cityPublished + ": " + 
							publishingCompany + ", " + copyright + "), " + usedPage + ".");
		return;
	}
	
	public void book() {
		int numOfAuthors = authorNum();
		if(numOfAuthors == 0) {
			bookCorporate();
		}
		else if(numOfAuthors == 1) {
			book1Author();
		}
		else if(numOfAuthors == 2) {
			book2Authors();
		}
		else if(numOfAuthors >= 3){
		}
		else {
			book();
		}
	}

	@Override
	public void youtube() {
		// TODO Auto-generated method stub
		
	}
	
	public void chicago() {
		String type = sourceType();
		if(type.equalsIgnoreCase("exit")) {
			CitationMachine.citationStyle();
		}
		else if(type.equalsIgnoreCase("website")) {
			website();
		}
		
		else if(type.equalsIgnoreCase("book")) {
			book();
		}
		else if(type.equalsIgnoreCase("youtube video")) {
			youtube();
		}
		else {
			chicago();
		}
	}
}
