enum Day{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
class enumDemo{
	public static void main(String[] args){
		Day today = Day.Wednesday;
		System.out.println("Today is : " + today);
		switch(today){
			case Monday: 
				     System.out.println("Start of the week");
				     break;
			case Wednesday:
				    System.out.println("Middle of the week");
				    break;
			case Friday:
				    System.out.println("Almost week end");
				    break;
			default:
				System.out.println("Regular Day");
		}
		System.out.println("\nAll Days");
		for(Day d:Day.values()){
			System.out.println(d);
		}
	}
}

