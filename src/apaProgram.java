
import java.util.*;

public class apaProgram extends AllProgramMethods {
	Scanner reader = CitationMachine.reader;
	// static Scanner reader = new Scanner (System.in);
	
	// Constructor
	public apaProgram() {
	}
	
	public void instructions() {
		//Instructions to format the APA page
		System.out.println("APA Instructions:");
		System.out.println("- Create a separate page titled: References");
		System.out.println("- Center the title.");
		System.out.println("- All Words: size 12, font 'Times New Roman'.");
		System.out.println("- Double space everything.");
		System.out.println("- Starting from the second line of every source needs to be indented.");
		System.out.println("- Put all sources in alphabetical order.\n");
	}

	public String sourceType() {
		//Ask which source to cite
		System.out.println("What source do you want to cite (website, news webpage, book, youtube video, ebook)? Enter \"exit\" to quit: ");
		String source = reader.nextLine();
		return source;
	}
	
	// APA Website Citation
	public void website() {
		// Get user input
		System.out.println("Enter Author's first letter of their name (If there isn't one, write 'n/a'): ");
		String firstLetter = reader.nextLine();
		
		String lastName = null;
		if(!firstLetter.equalsIgnoreCase("n/a")) {
			System.out.println("Enter Author's last name: ");
			lastName = reader.nextLine();
		}
		
		System.out.println("Enter Year of copyright OR last modified (Ex: 2020, January 17). If there is no date, write 'n/a': ");
		String date = reader.nextLine();
		
		System.out.println("Enter title of article: ");
		String articleTitle = reader.nextLine();
		
		System.out.println("Enter company name: ");
		String company = reader.nextLine();
		
		System.out.println("Enter URL: ");
		String URL = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		// Output website citation
		// If website has no author
		if(firstLetter.equalsIgnoreCase("n/a") || lastName.equalsIgnoreCase("n/a")) {
			
			//if website has no date
			if(date.equalsIgnoreCase("n/a")) {
				System.out.println(company + ". (n.d.) " + articleTitle + ". " + company + ". Retrieved from " + URL);
				italics(articleTitle);
				inTextCitation(company + ", n.d.");
				return;
			}
			//if website has a date
			else {
				System.out.println(company + ". (" + date + "). " + articleTitle + ". Retrieved from " + URL);
				italics(articleTitle);
				inTextCitation(company + ", year of copyright or year last modified");
				return;
			}
		}
		
		//If website has an author
		else {
			//if website has no date
			if(date.equalsIgnoreCase("n/a")) {
				System.out.println(lastName + ", " + firstLetter + ". (n.d.) " + articleTitle + ". " + company + ". Retrieved from " + URL);
				italics(articleTitle);
				inTextCitation(lastName + ", n.d.");
				return;
			}
			//if website has a date
			else {
				System.out.println(lastName + ", " + firstLetter + ". (" + date + "). " + articleTitle + ". " + company + 
									". Retrieved from " + URL);
				italics(articleTitle);
				inTextCitation(lastName + ", year of copyright or year last modified");
				return;
			}
		}
	}
	
	public void bookCorporate() {
		// authorNum() == 0
		// Means no author
		//Ask for APA requirements (Author's last name, First name, title of book...);
		System.out.println("Enter Corporate Author name: ");
		reader.nextLine();
		String corporateAuthor = reader.nextLine();
		
		System.out.println("Enter year of copyright: ");
		String copyright = reader.nextLine();
		
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
		
		System.out.println("Enter the city of publication (Ex: Toronto): ");
		String city = reader.nextLine();
				
		System.out.println("Enter province or state (Ex: Ontario): ");
		String state = reader.nextLine();
				
		System.out.println("Enter the author's full name (Ex: Emily Ho): ");
		String author = reader.nextLine();
	
		System.out.println("\nCiting now...\n");
		
		System.out.println(corporateAuthor + ". (" + copyright + "). " + title + ". " + city + ", " + state + ": " + author + ".");
		italics(title);
		inTextCitation(corporateAuthor + ", " + copyright);
		return;
	}
	
	public void book1Author() {
		// authorNum() == 1
		// Book has only one author
		System.out.println("Enter Author's first letter of their name: ");
		String initial = reader.nextLine();
		
		System.out.println("Enter Author's last name: ");
		String lastName = reader.nextLine();
		
		System.out.println("Enter Year of publishing: ");
		String publishing = reader.nextLine();
		
		System.out.println("Enter title of book: ");
		String title = reader.nextLine();
		
		System.out.println("Enter city of publication (Ex: Toronto): ");
		String publication = reader.nextLine();
		
		System.out.println("Enter Province or State (Ex: ON): ");
		String province = reader.nextLine();
		
		System.out.println("Enter Company of publication: ");
		String company = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		//Make the APA citation for the book
		System.out.println(lastName + ", " + initial + ". (" + publishing + "). " + title + ". " + publication +
							", " + province + ": " + company + ".");
		italics(title);
		inTextCitation(lastName + ", " + publishing);
		System.out.println("** Note: Add the page number if quoting directly/paraphrasing a specific section of text (Ex: Ho, 2020, p. 18)");
		return;
	}
	
	public void book2Authors() {
		// authorNum() == 2
		// Book with 2 authors
		System.out.println("Enter author's first initial (1st Author): ");
		reader.nextLine();
		String firstInitial1 = reader.nextLine();
				
		System.out.println("Enter Author's last name (1st Author): ");
		String lastName1 = reader.nextLine();
				
		System.out.println("Enter author's first initial (2nd Author): ");
		String firstInitial2 = reader.nextLine();
				
		System.out.println("Enter Author's last name (2nd Author): ");
		String lastName2 = reader.nextLine();
				
		System.out.println("Enter year of copyright: ");
		String copyright = reader.nextLine();
		
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
				
		System.out.println("Enter the city of publishing (Ex: Toronto): ");
		String city = reader.nextLine();
				
		System.out.println("Enter the province or state (Ex: Ontario): ");
		String province = reader.nextLine();
				
		System.out.println("Enter the company of publishing: ");
		String company = reader.nextLine();
				
		System.out.println("\nCiting now...\n");
		
		System.out.println(lastName1 + ", " + firstInitial1 + " & " + lastName2 + ", " + firstInitial2 + ". (" + copyright + "). " 
				+ title + ". " + city + ", " + province + ": " + company + ".");
		italics(title);
		inTextCitation(lastName1 + " & " + lastName2 + ", " + copyright);
		return;
	}
	
	public void book3_6Authors() {
		// authorNum() >= 3 && authorNum() <= 6
		// Book with 3 to 6 authors
		System.out.print("Enter author's first initial (1st Author): ");
		reader.nextLine();
		String firstInitial1 = reader.nextLine();
				
		System.out.print("Enter Author's last name (1st Author): ");
		String lastName1 = reader.nextLine();
				
		System.out.print("Enter author's first initial (2nd Author): ");
		String firstInitial2 = reader.nextLine();
				
		System.out.print("Enter Author's last name (2nd Author): ");
		String lastName2 = reader.nextLine();
		
		System.out.print("Enter author's first initial (3rd Author): ");
		String firstInitial3 = reader.nextLine();
				
		System.out.print("Enter Author's last name (3rd Author): ");
		String lastName3 = reader.nextLine();
				
		System.out.print("Enter year of copyright: ");
		String copyright = reader.nextLine();
		
		System.out.print("Enter title of the book: ");
		String title = reader.nextLine();
				
		System.out.print("Enter the city of publishing (Ex: Toronto): ");
		String city = reader.nextLine();
				
		System.out.print("Enter the province or state (Ex: Ontario): ");
		String province = reader.nextLine();
				
		System.out.print("Enter the company of publishing: ");
		String company = reader.nextLine();
				
		System.out.println("\nCiting now...\n");
		
		System.out.println(lastName1 + ", " + firstInitial1 + " & " + lastName2 + ", " + firstInitial2 + " & " + lastName3 + 
				", " + firstInitial3 + ". (" + copyright + "). " + title + ". " + city + ", " + province + ": " + company + ".");
		italics(title);
		inTextCitation(lastName1 + " et al.");
		return;
	}
	
	public void book7AuthorsAndMore() {
		// authorNum() >= 7
		// Book with 7 or more authors
		System.out.println("Sorry, this is way too many authors for this citation machine to cite.\nTry searching online for the format.");
		inTextCitation("1st Author's Last Name..., year of copyright");
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
		else if(numOfAuthors >= 3 && numOfAuthors <= 6) {
			book3_6Authors();
		}
		else if(numOfAuthors >= 7){
			book7AuthorsAndMore();
		}
		else {
			book();
		}
	}
	
	public void youtube() {
		System.out.print("Enter uploader's name: ");
		String uploader = reader.nextLine();
		
		System.out.print("Enter the date the video was uploaded (Ex: 2020, September 6): ");
		String dateUploaded = reader.nextLine();
		
		System.out.print("Enter title of video: ");
		String videoTitle = reader.nextLine();
		
		System.out.print("Enter URL: ");
		String URL = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		//Make the APA citation for the book
		System.out.println(uploader + ". (" + dateUploaded + "). " + videoTitle + " [Video file]. Retrieved from " + URL);
		italics(videoTitle);
		inTextCitation(uploader + ", year the video was uploaded");
		return;
	}
	
	public void ebook() {
		System.out.print("Enter author's first initial: ");
		String firstInitial = reader.nextLine();
		
		System.out.print("Enter author's middle initial (If there isn't one, write 'n/a'): ");
		String middleInitial = reader.nextLine();
		
		System.out.print("Enter author's last name: ");
		String lastName = reader.nextLine();
		
		System.out.print("Enter year of publication (If there isn't one, write 'n/a'): ");
		String publicationDate = reader.nextLine();
		
		System.out.print("Enter title of Ebook: ");
		String ebookTitle = reader.nextLine();
		
		System.out.print("Enter subtitle of Ebook (If there isn't one, write 'n/a'): ");
		String ebookSubtitle = reader.nextLine();
		
		System.out.print("Enter the publisher name: ");
		String publisher = reader.nextLine();
		
		System.out.print("Enter the website address: ");
		String webAddress = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		// APA EBOOK CITATION
		//if no subtitle
		if(ebookSubtitle.equalsIgnoreCase("n/a")) {
			//if no publication date
			if(publicationDate.equalsIgnoreCase("n/a")) {
				//if no middle name
				if(middleInitial.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstInitial + ". (n.d.). " + ebookTitle + ". " 
										+ publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle);
					inTextCitation(lastName + ", n.d.");
					return;
				}
				//if there is a middle name
				else {
					System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (n.d.). " + ebookTitle + ". " 
										+ publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle);
					inTextCitation(lastName + ", n.d.");
					return;
				}
			}
			//if there is a publication date
			else {
				//if no middle name
				if(middleInitial.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + ebookTitle + ". " 
										+ publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle);
					inTextCitation(lastName + ", " + publicationDate);
					return;
				}
				//if there is a middle name
				else {
					System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (" + publicationDate + "). " + ebookTitle + ". " 
										+ publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle);
					inTextCitation(lastName + ", " + publicationDate);
					return;
				}
			}
		}
		//if there is a subtitle
		else {
			//if no publication date
			if(publicationDate.equalsIgnoreCase("n/a")) {
				//if no middle name
				if(middleInitial.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstInitial + ". (n.d.). " + ebookTitle + ": " 
										+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle + ": " + ebookSubtitle);
					inTextCitation(lastName + ", n.d.");
					return;
				}
				//if there is a middle name
				else {
					System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (n.d.). " + ebookTitle + ": " 
										+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle + ": " + ebookSubtitle);
					inTextCitation(lastName + ", n.d.");
					return;
				}
			}
			//if there is a publication date
			else {
				//if no middle name
				if(middleInitial.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + ebookTitle + ": " 
										+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle + ": " + ebookSubtitle);
					inTextCitation(lastName + ", " + publicationDate);
					return;
				}
				//if there is a middle name
				else {
					System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (" + publicationDate + "). " + ebookTitle + ": " 
										+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
					italics(ebookTitle + ": " + ebookSubtitle);
					inTextCitation(lastName + ", " + publicationDate);
					return;	
				}
			}
		}
	}
	
	public void newsWebpage() {
		System.out.print("Enter author's first initial: ");
		String firstInitial = reader.nextLine();
		
		System.out.print("Enter author's last name: ");
		String lastName = reader.nextLine();
		
		System.out.print("Enter publication date (Ex: 2020, September 6). If there isn't one, write 'n/a': ");
		String publicationDate = reader.nextLine();
		
		System.out.print("Enter title of article: ");
		String title = reader.nextLine();
		
		System.out.print("Enter the company name: ");
		String company = reader.nextLine();
		
		System.out.print("Enter the website address: ");
		String webAddress = reader.nextLine();
		
		System.out.println("\nCiting now...\n");
		
		// APA NEWS WEBPAGE CITATION
		//if no publication date
		if(publicationDate.equalsIgnoreCase("n/a")) {
			System.out.println(lastName + ", " + firstInitial + ". (n.d.). " + title + ". " + company + ". " + webAddress);
			italics(title);
			inTextCitation(lastName + ", n.d.");
			return;
		}
		//if there is a publication date
		else {
			System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + title + ". " + company + ". " + webAddress);
			italics(title);
			inTextCitation(lastName + ", year of publishing");
			return;
		}
	}
	
	public void apa() {
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
		
		else if(type.equalsIgnoreCase("news webpage")) {
			newsWebpage();
		}
		
		else if(type.equalsIgnoreCase("youtube video")) {
			youtube();
		}
		
		else if(type.equalsIgnoreCase("ebook")) {
			ebook();
		}
		else {
			apa();
		}
	}
}
