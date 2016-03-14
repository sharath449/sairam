package day3;

public class switchcase {

	public static void main(String[] args) 
	{
		 String Course="Loadrunner";
		 
		 switch (Course) 
		 {
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Uft":
			System.out.println("You are selected Uft");
			break;
		case "LoadRunner":
			System.out.println("You are selected Loadrunner");
			break;

		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
