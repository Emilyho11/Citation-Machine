import java.util.*;

public class apaProgram {
	static Scanner reader = new Scanner (System.in);
	
	static void apa () {
		
		//Instructions to format the APA page
		System.out.println("APA Instructions:");
		System.out.println("- Create a separate page titled: References");
		System.out.println("- Center the title.");
		System.out.println("- All Words: size 12, font 'Times New Roman'.");
		System.out.println("- Double space everything.");
		System.out.println("- Starting from the second line of every source needs to be indented.");
		System.out.println("- Put all sources in alphabetical order.\n");
		
		//Ask which source to cite
		while(true) {
			System.out.println("What source do you want to cite (website, news webpage, book, youtube video, ebook)? Enter \"exit\" to quit: ");
			String source = reader.nextLine();
			
			if(source.equalsIgnoreCase("exit")) {
				return;
			}
			
/////////// If user types "website" as the source ///////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("website")) {
				//Ask for the APA requirements (Author's last name, First name, title of website...);
				System.out.print("Enter Author's first letter of their name (If there isn't one, write 'n/a'): ");
				String apaInitial = reader.nextLine();
				
				System.out.print("Enter Author's last name (If there isn't one, write 'n/a'): ");
				String apaLastName = reader.nextLine();
				
				System.out.print("Enter Year of copyright OR last modified (Ex: 2020, January 17). If there is no date, write 'n/a': ");
				String apaCopyright = reader.nextLine();
				
				System.out.print("Enter title of article: ");
				String apaArticleTitle = reader.nextLine();
				
				System.out.print("Enter company name: ");
				String apaCompany = reader.nextLine();
				
				System.out.print("Enter URL: ");
				String apaURL = reader.nextLine();
				
				System.out.println("\nCiting now...\n");
				
//============= APA Website Citation =======================================================================================================
				//If website has no author
				if(apaInitial.equalsIgnoreCase("n/a") || apaLastName.equalsIgnoreCase("n/a")) {
					
					//if website has no date
					if(apaCopyright.equalsIgnoreCase("n/a")) {
						System.out.println(apaCompany + ". (n.d.) " + apaArticleTitle + ". " + apaCompany + ". Retrieved from " + apaURL);
						System.out.println("\n** \"" + apaArticleTitle + "\" is in Italics **");
						
						//In-text citation format
						System.out.println("\nThis is the In-Text citation: ");
						System.out.println("(" + apaCompany + ", n.d.)");
						return;
					}
					//if website has a date
					else {
						System.out.println(apaCompany + ". (" + apaCopyright + "). " + apaArticleTitle + ". Retrieved from " + apaURL);
						System.out.println("\n** \"" + apaArticleTitle + "\" is in Italics **");
						
						//In-text citation format
						System.out.println("\nThis is the In-Text citation: ");
						System.out.println("(" + apaCompany + ", year of copyright or year last modified)");
						return;
					}
				}
				
				//If website has an author
				else {
					
					//if website has no date
					if(apaCopyright.equalsIgnoreCase("n/a")) {
						System.out.println(apaLastName + ", " + apaInitial + ". (n.d.) " + apaArticleTitle + ". " + apaCompany + ". Retrieved from " + apaURL);
						System.out.println("\n** \"" + apaArticleTitle + "\" is in Italics **");
						
						//In-text citation format
						System.out.println("\nThis is the In-Text citation: ");
						System.out.println("(" + apaLastName + ", n.d.)");
						return;
					}
					//if website has a date
					else {
						System.out.println(apaLastName + ", " + apaInitial + ". (" + apaCopyright + "). " + apaArticleTitle + ". " + apaCompany + 
											". Retrieved from " + apaURL);
						System.out.println("\n** \"" + apaArticleTitle + "\" is in Italics **");
						
						//In-text citation format
						System.out.println("\nThis is the In-Text citation: ");
						System.out.println("(" + apaLastName + ", year of copyright or year last modified)");
						return;
					}
				}
			}

/////////// If user types "book" as the source ///////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("book")) {
				//Ask how many authors
				System.out.print("How many authors are there (Type 0 if it's a corporate author): ");
				int authorNum = reader.nextInt();
				
//------------- if book has a corporate author ----------------------------------------------------------------------------------
				if(authorNum <= 0) {
					//Ask for APA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Corporate Author name: ");
					reader.nextLine();
					String corporateAuthor = reader.nextLine();
					
					System.out.print("Enter year of copyright: ");
					String copyright = reader.nextLine();
					
					System.out.print("Enter title of the book: ");
					String title = reader.nextLine();
					
					System.out.print("Enter the city of publication (Ex: Toronto): ");
					String city = reader.nextLine();
							
					System.out.print("Enter province or state (Ex: Ontario): ");
					String state = reader.nextLine();
							
					System.out.print("Enter the author's full name (Ex: Emily Ho): ");
					String author = reader.nextLine();
				
					System.out.println("\nCiting now...\n");
					
					System.out.println(corporateAuthor + ". (" + copyright + "). " + title + ". " + city + ", " + state + ": " + author + ".");
					System.out.println("\n** \"" + title + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + corporateAuthor + ", " + copyright + ")");
					return;
				}
//------------- else if book has 1 author -------------------------------------------------------------------------------------------------------------------
				else if (authorNum == 1) {
					
					//Ask for the APA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter Author's first letter of their name: ");
					String apaBookInitial = reader.nextLine();
					
					System.out.print("Enter Author's last name: ");
					String apaBookLastName = reader.nextLine();
					
					System.out.print("Enter Year of publishing: ");
					String apaPublishing = reader.nextLine();
					
					System.out.print("Enter title of book: ");
					String apaBookTitle = reader.nextLine();
					
					System.out.print("Enter city of publication (Ex: Toronto): ");
					String apaPublication = reader.nextLine();
					
					System.out.print("Enter Province or State (Ex: ON): ");
					String apaProvince = reader.nextLine();
					
					System.out.print("Enter Company of publication: ");
					String apaCompany = reader.nextLine();
					
					System.out.println("\nCiting now...\n");
					
					//Make the APA citation for the book
					System.out.println(apaBookLastName + ", " + apaBookInitial + ". (" + apaPublishing + "). " + apaBookTitle + ". " + apaPublication +
										", " + apaProvince + ": " + apaCompany + ".");
					System.out.println("\n** \"" + apaBookTitle + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + apaBookLastName + ", " + apaPublishing + ")");
					System.out.println("** Note: Add the page number if quoting directly/paraphrasing a specific section of text (Ex: Ho, 2020, p. 18)");
					return;
				}
//------------- else if book has 2 authors -------------------------------------------------------------------------------------------------------------------
				else if(authorNum == 2) {
					//Ask for APA requirements (Author's last name, First name, title of book...);
					System.out.print("Enter author's first initial (1st Author): ");
					reader.nextLine();
					String firstInitial1 = reader.nextLine();
							
					System.out.print("Enter Author's last name (1st Author): ");
					String lastName1 = reader.nextLine();
							
					System.out.print("Enter author's first initial (2nd Author): ");
					String firstInitial2 = reader.nextLine();
							
					System.out.print("Enter Author's last name (2nd Author): ");
					String lastName2 = reader.nextLine();
							
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
					
					System.out.println(lastName1 + ", " + firstInitial1 + " & " + lastName2 + ", " + firstInitial2 + ". (" + copyright + "). " 
										+ title + ". " + city + ", " + province + ": " + company + ".");
					System.out.println("\n** \"" + title + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + lastName1 + " & " + lastName2 + ", " + copyright + ")");
					return;
				}
//------------- else if book has 3-6 authors -------------------------------------------------------------------------------------------------------------------				
				else if(authorNum >= 3 && authorNum <= 6) {
					//Ask for APA requirements (Author's last name, First name, title of book...);
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
					System.out.println("\n** \"" + title + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + lastName1 + " et al.)");
					return;
				}
//------------- else if book has 7 or more authors -------------------------------------------------------------------------------------------------------------------
				else if(authorNum >= 7) {
					System.out.println("Sorry, this is way too many authors for this citation machine to cite.\nTry searching online for the format.");
					
					//In-text citation format
					System.out.println("However, the In-Text Citation is: ");
					System.out.println("(1st Author's Last Name..., year of copyright)");
					return;
				}
			}
			
/////////// If user types "youtube video" as the source /////////////////////////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("youtube video")) {
				//Ask for the APA requirements (Author's last name, First name...);
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
				System.out.println("\n** \"" + videoTitle + "\" is in Italics **");
				
				//In-text citation format
				System.out.println("\nThe In-Text citation is: ");
				System.out.println("(" + uploader + ", year the video was uploaded)");
				return;
			}
			
/////////// If user types "ebook" as the source //////////////////////////////////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("ebook")) {
				//Ask for the APA requirements (Author's last name, First name...);
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
				
//============= APA EBOOK CITATION ============================================================================================================================
				//if no subtitle
				if(ebookSubtitle.equalsIgnoreCase("n/a")) {
					//if no publication date
					if(publicationDate.equalsIgnoreCase("n/a")) {
						//if no middle name
						if(middleInitial.equalsIgnoreCase("n/a")) {
							System.out.println(lastName + ", " + firstInitial + ". (n.d.). " + ebookTitle + ". " 
												+ publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", n.d.)");
							return;
						}
						//if there is a middle name
						else {
							System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (n.d.). " + ebookTitle + ". " 
												+ publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", n.d.)");
							return;
						}
					}
					//if there is a publication date
					else {
						//if no middle name
						if(middleInitial.equalsIgnoreCase("n/a")) {
							System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + ebookTitle + ". " 
												+ publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", " + publicationDate + ")");
							return;
						}
						//if there is a middle name
						else {
							System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (" + publicationDate + "). " + ebookTitle + ". " 
												+ publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", " + publicationDate + ")");
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
							System.out.println("\n** \"" + ebookTitle + ": " + ebookSubtitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", n.d.)");
							return;
						}
						//if there is a middle name
						else {
							System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (n.d.). " + ebookTitle + ": " 
												+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + ": " + ebookSubtitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", n.d.)");
							return;
						}
					}
					//if there is a publication date
					else {
						//if no middle name
						if(middleInitial.equalsIgnoreCase("n/a")) {
							System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + ebookTitle + ": " 
												+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + ": " + ebookSubtitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", " + publicationDate + ")");
							return;
						}
						//if there is a middle name
						else {
							System.out.println(lastName + ", " + firstInitial + ". " + middleInitial + ". (" + publicationDate + "). " + ebookTitle + ": " 
												+ ebookSubtitle + ". " + publisher + ". Retrieved from " + webAddress);
							System.out.println("\n** \"" + ebookTitle + ": " + ebookSubtitle + "\" is in Italics **");
							
							//In-text citation format
							System.out.println("\nThis is the In-Text citation: ");
							System.out.println("(" + lastName + ", " + publicationDate + ")");
							return;	
						}
					}
				}
			}
/////////// If user types "news webpage" as the source //////////////////////////////////////////////////////////////////////////////////////////////////////////////
			else if(source.equalsIgnoreCase("news webpage")) {
				//Ask for the APA requirements (Author's last name, First name...);
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
				
//============= APA NEWS WEBPAGE CITATION ============================================================================================================================
				//if no publication date
				if(publicationDate.equalsIgnoreCase("n/a")) {
					System.out.println(lastName + ", " + firstInitial + ". (n.d.). " + title + ". " + company + ". " + webAddress);
					System.out.println("\n** \"" + title + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + lastName + ", n.d.)");
					return;
				}
				//if there is a publication date
				else {
					System.out.println(lastName + ", " + firstInitial + ". (" + publicationDate + "). " + title + ". " + company + ". " + webAddress);
					System.out.println("\n** \"" + title + "\" is in Italics **");
					
					//In-text citation format
					System.out.println("\nThis is the In-Text citation: ");
					System.out.println("(" + lastName + ", year of publishing)");
					return;
				}
			}
		}
	}
}
