import java.util.*;

public class chicagoProgram {
	static Scanner reader = new Scanner (System.in);
	
	static void chicago () {
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
		
		//Ask which source to cite
		while(true) {
			System.out.println("What source do you want to cite (website, book)? Enter \"exit\" to quit: ");
			String source = reader.nextLine();
			
			if(source.equalsIgnoreCase("exit")) {
				break;
			}
			
			else if(source.equalsIgnoreCase("website")) {
				while(true) {
					System.out.print("Is the website an Encyclodpedia (yes or no)? Enter \"exit\" to go back: ");
					String webType = reader.nextLine();
					webType.toLowerCase();
					
					if(webType.equalsIgnoreCase("exit")) {
						break;
					}
					
					//If website is an Encyclopedia, cite it in Encyclopedia format
					else if (webType.equalsIgnoreCase("yes")) {
						//Ask for the Chicago requirements (Author's last name, First name, title of website...);
						System.out.print("Enter Author's first name: ");
						String chicagoFirstName = reader.nextLine();
						
						System.out.print("Enter Author's last name: ");
						String chicagoLastName = reader.nextLine();
						
						System.out.print("Enter title of article: ");
						String chicagoArticleTitle = reader.nextLine();
						
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
						
						System.out.println("Here is the citation for the bibliography page:");
						System.out.println(chicagoLastName + ", " + chicagoFirstName + ". \"" + chicagoArticleTitle + ".\" " + encyclopediaName + 
											". " + cityPublished + ": " + publishingCompany + ", " + copyright + ".");
						
						System.out.println("");
						System.out.println("\nHere is the citation for the Footnote/Endnote:");
						System.out.println(chicagoFirstName + (" ") + chicagoLastName + ". \"" + chicagoArticleTitle + ".\" " + encyclopediaName + 
											" (" + cityPublished + ": " + publishingCompany + ", " + copyright + "), " + usedPage + ".");
						CitationMachine.main(null);
					}
					
					//If website is not an Encyclopedia, Cite it in website format
					else if(webType.equalsIgnoreCase("no")){
						//Ask for the Chicago requirements (Author's last name, First name, title of website...);
						System.out.print("Enter Author's first name (If there isn't one, write 'n/a'): ");
						String chicagoWebFirstName = reader.nextLine();
						
						System.out.print("Enter Author's last name (If there isn't one, write 'n/a'): ");
						String chicagoWebLastName = reader.nextLine();
						
						System.out.print("Enter title of article: ");
						String chicagoWebArticleTitle = reader.nextLine();
						
						System.out.print("Enter the Website Company Name: ");
						String chicagoWebCompanyName = reader.nextLine();
						
						System.out.print("Enter URL: ");
						String chicagoURL = reader.nextLine();
						
						System.out.print("Enter date you accessed the website (Ex: January 29, 2020): ");
						String chicagoAccessedDate = reader.nextLine();
						
						System.out.println("\nCiting now...\n");
						
		//============= Chicago Website Citation ============================================================================================
						//If website has no author
						if(chicagoWebFirstName.equalsIgnoreCase("n/a") || chicagoWebLastName.equalsIgnoreCase("n/a")) {
							System.out.println("Here is the citation for the bibliography page:");
							System.out.println(chicagoWebCompanyName + ". \"" + chicagoWebArticleTitle + ".\" " + chicagoURL + " (accessed " + 
												chicagoAccessedDate + ").");
						
							System.out.println("\nHere is the citation for the Footnote/Endnote:");
							System.out.println(chicagoWebCompanyName + ", \"" + chicagoWebArticleTitle + ".\" " + chicagoURL + " (accessed " + 
												chicagoAccessedDate + ").");
							CitationMachine.main(null);
						}
						
						//If website has an author
						else {
							System.out.println("Here is the citation for the bibliography page:");
							System.out.println(chicagoWebLastName + ", " + chicagoWebFirstName + ". \"" + chicagoWebArticleTitle + ".\" " + 
												chicagoWebCompanyName + ", " + chicagoURL + " (accessed " + chicagoAccessedDate + ").");
							
							System.out.println("\nHere is the citation for the Footnote/Endnote:");
							System.out.println(chicagoWebFirstName + " " + chicagoWebLastName + ", \"" + chicagoWebArticleTitle + ".\" " +
												chicagoWebCompanyName + ", " + chicagoURL + " (accessed " + chicagoAccessedDate + ").");
							CitationMachine.main(null);
						}
					}
				}
			}
			
			//If user wants to cite a book
			else if(source.equalsIgnoreCase("book")) {
				while(true) {
					System.out.print("How many authors does the book have (1 or 2)? Enter \"exit\" to quit: ");
					String authorNum = reader.nextLine();
					
					if(authorNum.equalsIgnoreCase("exit")) {
						break;
					}
					
					//If book has only one author
					else if (authorNum.equals("1")) {
						System.out.print("Enter Author's first name: ");
						String bookFirstName = reader.nextLine();
						
						System.out.print("Enter Author's last name: ");
						String bookLastName = reader.nextLine();
						
						System.out.print("Enter Title of Book: ");
						String bookTitle = reader.nextLine();
						
						System.out.print("Enter the city of publishing: ");
						String bookCityPublished = reader.nextLine();
						
						System.out.print("Enter the Publishing Company: ");
						String publishingCompany = reader.nextLine();
						
						System.out.print("Enter the copyright: ");
						String bookCopyright = reader.nextLine();
						
						System.out.print("Enter the page number that you used: ");
						String usedPage = reader.nextLine();
						
						System.out.println("\nCiting now...\n");
						
						//Cite Book in Chicago format (Bibliography)
						System.out.println("Here is the citation for the bibliography page:");
						System.out.println(bookLastName + ", " + bookFirstName + ". " + bookTitle + ". " + bookCityPublished + ": " + 
											publishingCompany + ", " + bookCopyright + ".");
						
						System.out.println("");
						//Cite Book in Chicago format (Footnote/Endnote)
						System.out.println("\nHere is the citation for the Footnote/Endnote:");
						System.out.println(bookFirstName + " " + bookLastName + ", " + bookTitle + " (" + bookCityPublished + ": " + 
											publishingCompany + ", " + bookCopyright + "), " + usedPage + ".");
						CitationMachine.main(null);
					}
					
					//If book has two authors
					else if (authorNum.equals("2")) {
						System.out.print("Enter first name of Author 1: ");
						String bookFirstName1 = reader.nextLine();
						
						System.out.print("Enter last name of Author 1: ");
						String bookLastName1 = reader.nextLine();
						
						System.out.print("Enter first name of Author 2: ");
						String bookFirstName2 = reader.nextLine();
						
						System.out.print("Enter last name of Author 2: ");
						String bookLastName2 = reader.nextLine();
						
						System.out.print("Enter Title of Book: ");
						String bookTitle = reader.nextLine();
						
						System.out.print("Enter the city of publishing: ");
						String bookCityPublished = reader.nextLine();
						
						System.out.print("Enter the Publishing Company: ");
						String publishingCompany = reader.nextLine();
						
						System.out.print("Enter the copyright: ");
						String bookCopyright = reader.nextLine();
						
						System.out.print("Enter the page number that you used: ");
						String usedPage = reader.nextLine();
						
						System.out.println("\nCiting now...\n");
						
						//Cite Book in Chicago format (Bibliography)
						System.out.println("Here is the citation for the bibliography page:");
						System.out.println(bookLastName1 + ", " + bookFirstName1 + " and " + bookFirstName2 + " " + bookLastName2 + 
											". " + bookTitle + ". " + bookCityPublished + ": " + publishingCompany + ", " + bookCopyright + ".");
						
						System.out.println("");
						//Cite Book in Chicago format (Footnote/Endnote)
						System.out.println("\nHere is the citation for the Footnote/Endnote:");
						System.out.println(bookLastName1 + " and " + bookLastName2 + ", " + bookTitle + " (" + bookCityPublished + ": " + 
											publishingCompany + ", " + bookCopyright + "), " + usedPage + ".");
						CitationMachine.main(null);
					}
				}
			}
		}
		CitationMachine.main(null);
		reader.close();
	}
}
