public abstract class AllProgramMethods {

	public abstract String sourceType();
	public abstract void instructions();
	public abstract void website();
	public abstract void bookCorporate();
	public abstract void book1Author();
	public abstract void book2Authors();
	public abstract void book();
	public abstract void youtube();
	
	public void italics(String title) {
		System.out.println("\n** \"" + title + "\" is in Italics **");
	}
	
	public void inTextCitation(String inTextString) {
		//In-text citation format
		System.out.println("\nIn-Text citation: ");
		System.out.println("(" + inTextString + ")");
	}
	
	public int authorNum() {
		//Ask how many authors
		System.out.println("How many authors are there (Type 0 if it's a corporate author): ");
		int authorNum = CitationMachine.reader.nextInt();
		return authorNum;
	}
}
