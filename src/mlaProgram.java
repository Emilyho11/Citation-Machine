import java.util.*;

public class mlaProgram extends AllProgramMethods {
	Scanner reader = CitationMachine.reader;
	// static Scanner reader = new Scanner (System.in);
	
	public mlaProgram() {
		
	}

	public void instructions() {
		//Instructions to format the MLA page
				System.out.println("MLA Instructions:");
				System.out.println("- Create a separate page titled: Works Cited");
				System.out.println("- Center the title.");
				System.out.println("- All Words: size 12, font 'Times New Roman'.");
				System.out.println("- Double space everything.");
				System.out.println("- Starting from the second line of every source needs to be indented.");
				System.out.println("- Put all sources in alphabetical order\n");
	}
	
	public String sourceType() {
		//Ask which source to cite
		System.out.println("What source do you want to cite (website, book, online image, youtube video)? Enter \"exit\" to quit: ");
		String source = reader.nextLine();
		return source;
	}
	
	// MLA Website Citation
	public void website() {
		//Ask for MLA requirements (Author's last name, First name, title of website...);
		System.out.println("Enter Author's first name (If there isn't one, write 'n/a'): ");
		String firstName = reader.nextLine();
		
		String lastName = null;
		if(!firstName.equalsIgnoreCase("n/a")) {
			System.out.println("Enter Author's last name (If there isn't one, write 'n/a'): ");
			lastName = reader.nextLine();
		}
			
		System.out.println("Enter the title of page or document: ");
		String webpageTitle = reader.nextLine();
			
		System.out.println("Enter the company of website: ");
		String company = reader.nextLine();
		
		System.out.println("Enter date of copyright or date last modified/updated (Ex: 17 Jan. 2020). If there is no date, write 'n/a': ");
		String date = reader.nextLine();
			
		System.out.println("Enter URL: ");
		String URL = reader.nextLine();
			
		System.out.println("Enter date you accessed the website (Ex: 17 January 2020): ");
		String accessedDate = reader.nextLine();
			
		System.out.println("\nCiting now...\n");
		
		// MLA WEBSITE CITATION:
		//If website has no author
		if(firstName.equalsIgnoreCase("n/a") || lastName.equalsIgnoreCase("n/a")) {
			//If webPageTitle has punctuation after the title, do not add a period
			if (webpageTitle.endsWith(".")||webpageTitle.endsWith("?")||webpageTitle.endsWith("!")) {
				
				//if no date
				if(date.equalsIgnoreCase("n/a")) {
					System.out.println("\"" + webpageTitle + "\" " + company + ", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation("\"" + webpageTitle + "\"");
					return;
				}
				
				//if there is a date
				else {
					System.out.println("\"" + webpageTitle + "\" " + company + ", " + date + ", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation("\"" + webpageTitle + "\"");
					return;
				}
			}
			//If websitePageTitle has no punctuation, add period
			else {
				
				//if no date
				if(date.equalsIgnoreCase("n/a")) {
					System.out.println("\"" + webpageTitle + ".\" " + company + ", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation("\"" + webpageTitle + "\"");
					return;
				}
				else {
					System.out.println("\"" + webpageTitle + ".\" " + company + ", " + date + ", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation("\"" + webpageTitle + "\"");
					return;
				}
			}
		}
		//If website has an author
		else {
			//If websitePageTitle has punctuation after the title, do not add a period
			if (webpageTitle.endsWith(".")||webpageTitle.endsWith("?")||webpageTitle.endsWith("!")) {
				
				//if no date
				if(date.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstName + ". \"" + webpageTitle + "\" " + company + ", " + 
										URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation(lastName);
					return;
				}
				//if there is a date
				else {
					System.out.println(lastName + ", " + firstName + ". \"" + webpageTitle + "\" " + company + ", " + date + 
							", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation(lastName);
					return;
				}
			}
			//If websitePageTitle has no punctuation, add period
			else {
				//if no date
				if(date.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstName + ". \"" + webpageTitle + ".\" " + company + ", " 
										+ URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation(lastName);
					return;
				}
				//if there is a date
				else {
					System.out.println(lastName + ", " + firstName + ". \"" + webpageTitle + ".\" " + company + ", " + date +
										", " + URL + ". Accessed " + accessedDate + ".");
					italics(company);
					inTextCitation(lastName);
					return;
				}
			}
		}
	}
	
	public void bookCorporate() {
		// authorNum() == 0
		// Means no author
		//Ask for MLA requirements (Author's last name, First name, title of book...);
		System.out.println("Enter Corporate Author name: ");
		reader.nextLine();
		String corporateAuthor = reader.nextLine();
			
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
				
		System.out.println("Enter the subtitle (If there isn't one, write 'n/a'): ");
		String subtitle = reader.nextLine();
				
		System.out.println("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
		String edition = reader.nextLine();
				
		System.out.println("Enter publisher name: ");
		String publisherName = reader.nextLine();
				
		System.out.println("Enter year of publication: ");
		String publication = reader.nextLine();
	
		System.out.println("\nCiting now...\n");
			
		//If book has no subtitle 
		if (subtitle.equalsIgnoreCase("n/a")) {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(corporateAuthor + ". " + title + ". " + publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(corporateAuthor + " Page number");
				return;
			}
			else {
				System.out.println(corporateAuthor + ". " + title + ". " + edition + ", " 
									+ publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(corporateAuthor + " Page number");
				return;
			}
		}
		//If book has a subtitle
		else {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(corporateAuthor + ". " + title + ": " + subtitle + ". " + 
						publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(corporateAuthor + " Page number");
				return;
			}
			else {
				System.out.println(corporateAuthor + ". " + title + ": " + subtitle + ". " + 
						edition + ", " + publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(corporateAuthor + " Page number");
				return;
			}
		}
	}
	
	public void book1Author() {
		// authorNum() == 1
		// Book has only one author
		//Ask for MLA requirements (Author's last name, First name, title of book...);
		System.out.println("Enter Author's first name: ");
		reader.nextLine();
		String firstName = reader.nextLine();
				
		System.out.println("Enter Author's last name: ");
		String lastName = reader.nextLine();
			
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
			
		System.out.println("Enter the subtitle (If there isn't one, write 'n/a'): ");
		String subtitle = reader.nextLine();
			
		System.out.println("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
		String edition = reader.nextLine();
				
		System.out.println("Enter publisher name: ");
		String publisherName = reader.nextLine();
				
		System.out.println("Enter year of publication: ");
		String publication = reader.nextLine();
			
		System.out.println("\nCiting now...\n");
				
		//If book has no subtitle 
		if (subtitle.equalsIgnoreCase("n/a")) {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName + ", " + firstName + ". " + title + ". " + publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(lastName + " Page number");
				return;
			}
			else {
				System.out.println(lastName + ", " + firstName + ". " + title + ". " + edition + ", " 
									+ publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(lastName + " Page number");
				return;
			}
		}
		//If book has a subtitle
		else {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName + ", " + firstName + ". " + title + ": " + subtitle + ". " 
									+ publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName + " Page number");
				return;
			}
			else {
				System.out.println(lastName + ", " + firstName + ". " + title + ": " + subtitle + ". " + 
									edition + ", " + publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName + " Page number");
				return;
			}
		}
	}
	
	public void book2Authors() {
		// authorNum() == 2
		// Book with 2 authors
		//Ask for MLA requirements (Author's last name, First name, title of book...);
		System.out.println("Enter Author's first name (1st Author): ");
		reader.nextLine();
		String firstName1 = reader.nextLine();
				
		System.out.println("Enter Author's last name (1st Author): ");
		String lastName1 = reader.nextLine();
				
		System.out.println("Enter Author's first name (2nd Author): ");
		String firstName2 = reader.nextLine();
				
		System.out.println("Enter Author's last name (2nd Author): ");
		String lastName2 = reader.nextLine();
				
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
				
		System.out.println("Enter the subtitle (If there isn't one, write 'n/a'): ");
		String subtitle = reader.nextLine();
				
		System.out.println("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
		String edition = reader.nextLine();
				
		System.out.println("Enter publisher name: ");
		String publisherName = reader.nextLine();
				
		System.out.println("Enter year of publication: ");
		String publication = reader.nextLine();
				
		System.out.println("\nCiting now...\n");
			
		//If book has no subtitle 
		if (subtitle.equalsIgnoreCase("n/a")) {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName1 + ", " + firstName1 + ", and " + firstName2 + " " + 
						lastName2 + ". " + title + ". " + publisherName + ", " + 
						publication + ".");
				italics(title);
				inTextCitation(lastName1 + " and " + lastName2 + " Page number");
				return;
			}
			else {
				System.out.println(lastName1 + ", " + firstName1 + ", and " + firstName2 + " " + 
						lastName2 + ". " + title + ". " + edition + ", " 
									+ publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(lastName1 + " and " + lastName2 + " Page number");
				return;
			}
		}
		//If book has a subtitle
		else {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName1 + ", " + firstName1 + ", and " + firstName2 + " " + 
						lastName2 + ". " + title + ": " + subtitle + ". " + publisherName 
									+ ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName1 + " and " + lastName2 + " Page number");
				return;
			}
			else {
				System.out.println(lastName1 + ", " + firstName1 + ", and " + firstName2 + " " + 
						lastName2 + ". " + title + ": " + subtitle + ". " +
						edition + ", " + publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName1 + " and " + lastName2 + " Page number");
				return;
			}
		}
	}
	
	public void book3AuthorsAndMore() {
		// authorNum() >= 3
		// Book with 3 or more authors
		//Ask for MLA requirements (Author's last name, First name, title of book...);
		System.out.println("Enter Author's first name (1st Author): ");
		reader.nextLine();
		String firstName = reader.nextLine();
			
		System.out.println("Enter Author's last name (1st Author): ");
		String lastName = reader.nextLine();
			
		System.out.println("Enter title of the book: ");
		String title = reader.nextLine();
			
		System.out.println("Enter the subtitle (If there isn't one, write 'n/a'): ");
		String subtitle = reader.nextLine();
			
		System.out.println("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
		String edition = reader.nextLine();
				
		System.out.println("Enter publisher name: ");
		String publisherName = reader.nextLine();
			
		System.out.println("Enter year of publication: ");
		String publication = reader.nextLine();
				
		System.out.println("\nCiting now...\n");
				
		//If book has no subtitle 
		if (subtitle.equalsIgnoreCase("n/a")) {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName + ", " + firstName + ", et al. " + title + ". " + 
						publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(lastName + " et al." + " Page number");
				return;
			}
			else {
				System.out.println(lastName + ", " + firstName + ", et al. " + title + ". " + 
						edition + ", " + publisherName + ", " + publication + ".");
				italics(title);
				inTextCitation(lastName + " et al." + " Page number");
				return;
			}
		}
		//If book has a subtitle
		else {
			//If book has no edition
			if(edition.equalsIgnoreCase("n/a")) {
				System.out.println(lastName + ", " + firstName + ", et al. " + title + ": " + 
						subtitle + ". " + publisherName + ", " + publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName + " et al." + " Page number");
				return;
			}
			else {
				System.out.println(lastName + ", " + firstName + ", et al. " + title + ": " + 
						subtitle + "." + edition + ", " + publisherName + ", " + 
						publication + ".");
				italics(title + ": " + subtitle);
				inTextCitation(lastName + " et al." + " Page number");
				return;
			}
		}
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
			book3AuthorsAndMore();
		}
		else {
			book();
		}
	}
	
	public void onlineImage() {
		System.out.println("Enter Artist's first name: ");
		String firstName = reader.nextLine();
			
		System.out.println("Enter Artist's last name: ");
		String lastName = reader.nextLine();
			
		System.out.println("Enter the title of digital image: ");
		String title = reader.nextLine();
		
		System.out.println("Enter date of creation: ");
		String date = reader.nextLine();
			
		System.out.println("Enter the institution where work is housed: ");
		String institution = reader.nextLine();
		
		System.out.println("Enter the city where work is housed: ");
		String city = reader.nextLine();
			
		System.out.println("Enter website address: ");
		String websiteAddress = reader.nextLine();
			
		System.out.print("Enter date you accessed the website (Ex: 17 Jan. 2020): ");
		String accessedDate = reader.nextLine();
			
		System.out.println("\nCiting now...\n");
		
		// MLA ONLINE IMAGE CITATION:
		System.out.println(lastName + ", " + firstName + ". " + title + ". " + date + ". " + institution + 
							", " + city + ", " + websiteAddress + ". Accessed " + accessedDate + ".");
		italics(title);
		return;
	}
	
	public void youtube() {
		System.out.println("Enter first name of person doing the video: ");
		String firstName = reader.nextLine();
			
		System.out.println("Enter last name of person doing the video: ");
		String lastName = reader.nextLine();
			
		System.out.println("Enter the title of YouTube video: ");
		String youtubeTitle = reader.nextLine();
		
		System.out.println("Enter person's name that uploaded the video: ");
		String uploadedPerson = reader.nextLine();
			
		System.out.println("Enter the date the video was uploaded (Ex: 5 September 2020): ");
		String date = reader.nextLine();
			
		System.out.println("Enter URL: ");
		String URL = reader.nextLine();
			
		System.out.println("\nCiting now...\n");
		
		System.out.println(lastName + ", " + firstName + ". \"" + youtubeTitle + ".\" YouTube, uploaded by " + 
							uploadedPerson + ", " + date + ", " + URL + ".");
		italics("YouTube");
		return;
	}
	
	public void mla() {
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
		else if(type.equalsIgnoreCase("online image")) {
			onlineImage();
		}
		else if(type.equalsIgnoreCase("youtube video")) {
			youtube();
		}
		else {
			mla();
		}
	}
}
