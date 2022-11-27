import java.util.*;

public class mlaProgram {
	static Scanner reader = new Scanner (System.in);
	
	static void mla () {
		//Instructions to format the MLA page
		System.out.println("MLA Instructions:");
		System.out.println("- Create a separate page titled: Works Cited");
		System.out.println("- Center the title.");
		System.out.println("- All Words: size 12, font 'Times New Roman'.");
		System.out.println("- Double space everything.");
		System.out.println("- Starting from the second line of every source needs to be indented.");
		System.out.println("- Put all sources in alphabetical order\n");
		System.out.println("In Text Citation Instructions:");
		System.out.println("- website with author, use: (Author's last name)");
		System.out.println("- website without author, use: (\"Title of Page or Document\")");
		System.out.println("- book with 1 author, use: (Author's last name Page number)");
		System.out.println("- book with 2 authors, use: (Author1 last name \"and\" Author2 last name Page number)");
		System.out.println("- book with 3 or more authors, use: (1st Author's last name \"et al.\" Page number)\n");

		//Ask which source to cite
		while (true) {
			System.out.println("What source do you want to cite (website, book, online image, youtube video)? Enter \"exit\" to quit: ");
			String source = reader.nextLine();
			
			if(source.equalsIgnoreCase("exit")) {
				break;
			}
				
/////////// If user types "website" as the source ///////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("website")) {
					
				//Ask for MLA requirements (Author's last name, First name, title of website...);
				System.out.print("Enter Author's first name (If there isn't one, write 'n/a'): ");
				String firstName = reader.nextLine();
					
				System.out.print("Enter Author's last name (If there isn't one, write 'n/a'): ");
				String lastName = reader.nextLine();
					
				System.out.print("Enter the title of page or document: ");
				String websitePageTitle = reader.nextLine();
					
				System.out.print("Enter the company of website: ");
				String company = reader.nextLine();
				
				System.out.print("Enter date of copyright or date last modified/updated (Ex: 17 Jan. 2020). If there is no date, write 'n/a': ");
				String date = reader.nextLine();
					
				System.out.print("Enter URL: ");
				String URL = reader.nextLine();
					
				System.out.print("Enter date you accessed the website (Ex: 17 January 2020): ");
				String accessedDate = reader.nextLine();
					
				System.out.println("\nCiting now...\n");
					
//============= MLA WEBSITE CITATION: ===============================================================================================
				//If website has no author
				if(firstName.equalsIgnoreCase("n/a") || lastName.equalsIgnoreCase("n/a")) {
					//If websitePageTitle has punctuation after the title, do not add a period
					if (websitePageTitle.endsWith(".")||websitePageTitle.endsWith("?")||websitePageTitle.endsWith("!")) {
						
						//if no date
						if(date.equalsIgnoreCase("n/a")) {
							System.out.println("\"" + websitePageTitle + "\" " + company + ", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
						
						//if there is a date
						else {
							System.out.println("\"" + websitePageTitle + "\" " + company + ", " + date + ", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If websitePageTitle has no punctuation, add period
					else {
						
						//if no date
						if(date.equalsIgnoreCase("n/a")) {
							System.out.println("\"" + websitePageTitle + ".\" " + company + ", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println("\"" + websitePageTitle + ".\" " + company + ", " + date + ", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
				//If website has an author
				else {
					//If websitePageTitle has punctuation after the title, do not add a period
					if (websitePageTitle.endsWith(".")||websitePageTitle.endsWith("?")||websitePageTitle.endsWith("!")) {
						
						//if no date
						if(date.equalsIgnoreCase("n/a")) {
							System.out.println(lastName + ", " + firstName + ". \"" + websitePageTitle + "\" " + company + ", " + 
												URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
						//if there is a date
						else {
							System.out.println(lastName + ", " + firstName + ". \"" + websitePageTitle + "\" " + company + ", " + date + 
									", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If websitePageTitle has no punctuation, add period
					else {
						//if no date
						if(date.equalsIgnoreCase("n/a")) {
							System.out.println(lastName + ", " + firstName + ". \"" + websitePageTitle + ".\" " + company + ", " 
												+ URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
						//if there is a date
						else {
							System.out.println(lastName + ", " + firstName + ". \"" + websitePageTitle + ".\" " + company + ", " + date +
												", " + URL + ". Accessed " + accessedDate + ".");
							System.out.println("\n** \"" + company + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
			}
/////////// If the user types "book" as the source ////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("book")) {
						
				//Ask how many authors
				System.out.print("How many authors are there (Type 0 if it's a corporate author): ");
				int authorNum = reader.nextInt();
						
//============= MLA BOOK CITATION ===============================================================================================
//------------- if book has a corporate author ----------------------------------------------------------------------------------
				if(authorNum <= 0) {
					//Ask for MLA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Corporate Author name: ");
					reader.nextLine();
					String bookCorporateAuthor = reader.nextLine();
						
					System.out.print("Enter title of the book: ");
					String bookTitle = reader.nextLine();
							
					System.out.print("Enter the subtitle (If there isn't one, write 'n/a'): ");
					String bookSubtitle = reader.nextLine();
							
					System.out.print("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
					String bookEdition = reader.nextLine();
							
					System.out.print("Enter publisher name: ");
					String bookPublisherName = reader.nextLine();
							
					System.out.print("Enter year of publication: ");
					String bookPublication = reader.nextLine();
				
					System.out.println("\nCiting now...\n");
						
					//If book has no subtitle 
					if (bookSubtitle.equalsIgnoreCase("n/a")) {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookCorporateAuthor + ". " + bookTitle + ". " + bookPublisherName + ", " + 
												bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookCorporateAuthor + ". " + bookTitle + ". " + bookEdition + ", " 
												+ bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If book has a subtitle
					else {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookCorporateAuthor + ". " + bookTitle + ": " + bookSubtitle + ". " + 
												bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookCorporateAuthor + ". " + bookTitle + ": " + bookSubtitle + ". " + 
												bookEdition + ", " + bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
//------------- else if book has 1 author ----------------------------------------------------------------------------------------
				else if (authorNum == 1) {
					//Ask for MLA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Author's first name: ");
					reader.nextLine();
					String bookFirstName = reader.nextLine();
							
					System.out.print("Enter Author's last name: ");
					String bookLastName = reader.nextLine();
						
					System.out.print("Enter title of the book: ");
					String bookTitle = reader.nextLine();
						
					System.out.print("Enter the subtitle (If there isn't one, write 'n/a'): ");
					String bookSubtitle = reader.nextLine();
						
					System.out.print("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
					String bookEdition = reader.nextLine();
							
					System.out.print("Enter publisher name: ");
					String bookPublisherName = reader.nextLine();
							
					System.out.print("Enter year of publication: ");
					String bookPublication = reader.nextLine();
						
					System.out.println("\nCiting now...\n");
							
					//If book has no subtitle 
					if (bookSubtitle.equalsIgnoreCase("n/a")) {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName + ", " + bookFirstName + ". " + bookTitle + ". " + bookPublisherName + ", " + 
												bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName + ", " + bookFirstName + ". " + bookTitle + ". " + bookEdition + ", " 
												+ bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If book has a subtitle
					else {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName + ", " + bookFirstName + ". " + bookTitle + ": " + bookSubtitle + ". " 
												+ bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName + ", " + bookFirstName + ". " + bookTitle + ": " + bookSubtitle + ". " + 
												bookEdition + ", " + bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
//------------- if book has 2 authors -------------------------------------------------------------------------------------------
				else if(authorNum == 2) {
					//Ask for MLA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Author's first name (1st Author): ");
					reader.nextLine();
					String bookFirstName1 = reader.nextLine();
							
					System.out.print("Enter Author's last name (1st Author): ");
					String bookLastName1 = reader.nextLine();
							
					System.out.print("Enter Author's first name (2nd Author): ");
					String bookFirstName2 = reader.nextLine();
							
					System.out.print("Enter Author's last name (2nd Author): ");
					String bookLastName2 = reader.nextLine();
							
					System.out.print("Enter title of the book: ");
					String bookTitle = reader.nextLine();
							
					System.out.print("Enter the subtitle (If there isn't one, write 'n/a'): ");
					String bookSubtitle = reader.nextLine();
							
					System.out.print("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
					String bookEdition = reader.nextLine();
							
					System.out.print("Enter publisher name: ");
					String bookPublisherName = reader.nextLine();
							
					System.out.print("Enter year of publication: ");
					String bookPublication = reader.nextLine();
							
					System.out.println("\nCiting now...\n");
						
					//If book has no subtitle 
					if (bookSubtitle.equalsIgnoreCase("n/a")) {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", and " + bookFirstName2 + " " + 
												bookLastName2 + ". " + bookTitle + ". " + bookPublisherName + ", " + 
												bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", and " + bookFirstName2 + " " + 
												bookLastName2 + ". " + bookTitle + ". " + bookEdition + ", " 
												+ bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If book has a subtitle
					else {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", and " + bookFirstName2 + " " + 
												bookLastName2 + ". " + bookTitle + ": " + bookSubtitle + ". " + bookPublisherName 
												+ ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", and " + bookFirstName2 + " " + 
												bookLastName2 + ". " + bookTitle + ": " + bookSubtitle + ". " +
												bookEdition + ", " + bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
//------------- if book has 3 or more authors -----------------------------------------------------------------------------------
				else {
					//Ask for MLA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Author's first name (1st Author): ");
					reader.nextLine();
					String bookFirstName1 = reader.nextLine();
						
					System.out.print("Enter Author's last name (1st Author): ");
					String bookLastName1 = reader.nextLine();
						
					System.out.print("Enter title of the book: ");
					String bookTitle = reader.nextLine();
						
					System.out.print("Enter the subtitle (If there isn't one, write 'n/a'): ");
					String bookSubtitle = reader.nextLine();
						
					System.out.print("Enter the Edition that is not 1st Edition (If there isn't one, write 'n/a'): ");
					String bookEdition = reader.nextLine();
							
					System.out.print("Enter publisher name: ");
					String bookPublisherName = reader.nextLine();
						
					System.out.print("Enter year of publication: ");
					String bookPublication = reader.nextLine();
							
					System.out.println("\nCiting now...\n");
							
					//If book has no subtitle 
					if (bookSubtitle.equalsIgnoreCase("n/a")) {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", et al. " + bookTitle + ". " + 
												bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", et al. " + bookTitle + ". " + 
												bookEdition + ", " + bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
					//If book has a subtitle
					else {
						//If book has no edition
						if(bookEdition.equalsIgnoreCase("n/a")) {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", et al. " + bookTitle + ": " + 
												bookSubtitle + ". " + bookPublisherName + ", " + bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
						else {
							System.out.println(bookLastName1 + ", " + bookFirstName1 + ", et al. " + bookTitle + ": " + 
												bookSubtitle + "." + bookEdition + ", " + bookPublisherName + ", " + 
												bookPublication + ".");
							System.out.println("\n** \"" + bookTitle + ": " + bookSubtitle + "\" is in Italics **");
							CitationMachine.main(null);
						}
					}
				}
			}
/////////// If the user types "online image" as the source ////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("online image")) {
				
				//Ask for MLA requirements (Author's last name, First name, ...);
				System.out.print("Enter Artist's first name: ");
				String firstName = reader.nextLine();
					
				System.out.print("Enter Artist's last name: ");
				String lastName = reader.nextLine();
					
				System.out.print("Enter the title of digital image: ");
				String imageTitle = reader.nextLine();
				
				System.out.print("Enter date of creation: ");
				String date = reader.nextLine();
					
				System.out.print("Enter the institution where work is housed: ");
				String institution = reader.nextLine();
				
				System.out.print("Enter the city where work is housed: ");
				String city = reader.nextLine();
					
				System.out.print("Enter website address: ");
				String websiteAddress = reader.nextLine();
					
				System.out.print("Enter date you accessed the website (Ex: 17 Jan. 2020): ");
				String accessedDate = reader.nextLine();
					
				System.out.println("\nCiting now...\n");
				
//============= MLA ONLINE IMAGE CITATION: ==================================================================================================
				System.out.println(lastName + ", " + firstName + ". " + imageTitle + ". " + date + ". " + institution + 
									", " + city + ", " + websiteAddress + ". Accessed " + accessedDate + ".");
				
				System.out.println("\n** \"" + imageTitle + "\" is in Italics **");
				CitationMachine.main(null);
			}
			
/////////// If the user types "youtube video" as the source ////////////////////////////////////////////////////////////////////////////	
			else if(source.equalsIgnoreCase("youtube video")) {
				//Ask for MLA requirements (Author's last name, First name,...);
				System.out.print("Enter first name of person doing the video: ");
				String firstName = reader.nextLine();
					
				System.out.print("Enter last name of person doing the video: ");
				String lastName = reader.nextLine();
					
				System.out.print("Enter the title of YouTube video: ");
				String youtubeTitle = reader.nextLine();
				
				System.out.print("Enter person's name that uploaded the video: ");
				String uploadedPerson = reader.nextLine();
					
				System.out.print("Enter the date the video was uploaded (Ex: 5 September 2020): ");
				String date = reader.nextLine();
					
				System.out.print("Enter URL: ");
				String URL = reader.nextLine();
					
				System.out.println("\nCiting now...\n");
				
				System.out.println(lastName + ", " + firstName + ". \"" + youtubeTitle + ".\" YouTube, uploaded by " + 
									uploadedPerson + ", " + date + ", " + URL + ".");
				
				System.out.println("\n** \"YouTube\" is in Italics **");
				CitationMachine.main(null);
			}
		}
		CitationMachine.main(null);
		reader.close();
	}
}
