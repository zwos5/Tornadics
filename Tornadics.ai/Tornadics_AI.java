import java.util.*;

public class Tornadics_AI
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);
		Scanner ef = new Scanner(System.in);
		
		char run;
		String input;
		String weather;
		char efView;
		int lvl;
		
		System.out.print("====================[TORNADICS.AI]====================\n");
		System.out.print("Enter a prompt to get started. \n");
		do {
		    System.out.print("");
		    input = sc.nextLine();
		    
		    if(input.equals("Hi")) {
		        System.out.println("Hello!");
		    }
		    else if(input.equals("How's it going?")) {
		        System.out.println("I'm doing good, how about you?");
		    }
		    else if(input.equals("Tell me about")) {
		        System.out.println("What would you like to know about? ");
		        weather = sc.nextLine();
		        
		        if(weather.equals("Rain")) {
		            System.out.println("Rain is water that has accumulated up in the atmosphere of the earth that falls when it gets heavy");
		        }
		        else if(weather.equals("Thunderstorm")) {
		            System.out.println("A thunderstorm occurs when the air is humid and hot or cold air moves in to an area where it currently hot/cold depending on the season");
		        }
		        else if(weather.equals("Tornado")) {
		            System.out.println("A tornado is a violently rotating column of air that happens when two different air temperatures begin blowing in opposite directions");
		            System.out.println("Would you like to see a chart of the different EF levels? ");
		            efView = ef.next().charAt(0);
		            
		            if(efView == 'y') {
		                System.out.println("============================================================[EF LEVELS]================================================================================");
		                System.out.println("EFU: Wind Speed: N/A Frequency: 3.11%: Usually no surveyable damage and intensity likely cannot be determined due to either a lack of information or winds weren't fast enough to cause damage.");
		                System.out.println("EF0: Wind Speed: 65-85mph Frequency: 52.82%: Some minor damage mostly among trees, old unrepaired buildings, windows, shingles, or loose small items.");
		                System.out.println("EF1: Wind Speed: 86-110mph Frequency: 32.98%: Moderate damage roofs will be stripped of shingles, mobile homes flipped, and doors and garage doors blown in");
		                System.out.println("EF2: Wind Speed: 111-135mph Frequency: 8.41%: Considerable damage whole roofs ripped off of frame houses, interiors of frame homes destroyed, weak structures completely destroyed");
		                System.out.println("EF3: Wind Speed: 136-165mph Frequency: 2.18%: Severe damage roofs and other walls blown away, multi-story homes have upper floors destroyed");
		                System.out.println("EF4: Wind Speed: 166-200mph Frequency: 0.46%: Devastating damage trees debarked partially, cars thrown, frame homes destroyed, moving trains blown off of tracks");
		                System.out.println("EF5: Wind Speed: >200mph Frequency: 0.05%: Incredible damage cars are destroyed and thrown hundreds of yards away from their starting location, any type of home is likely destroyed, corn fields flattened, skyscrapers suffer damage");
		            }
		            
		        }
		        else if(weather.equals("Snow")) {
		            System.out.println("Snow is like rain in a frozen form");
		        }
		        else if(weather.equals("Windy")) {
		            System.out.println("A windy day occurs when air begins moving at a quick rate of speed");
		        }
		        else {
		            System.out.println("Sorry I'm not sure about that");
		        }
		    }
		    else if(input.equals("What is your name?")) {
		        System.out.println("My name is Tornadics.ai I can tell you about the weather");
		    }
		    else if(input.equals("Do you do anything else besides weather?")) {
		        System.out.println("Not at this time but maybe in the future");
		    }
		    else {
		        System.out.println("Sorry I didn't get that.");
		        System.out.println("Perhaps I'll get it in a future update :)");
		    }
		    
		    System.out.println("Want to continue? (y for Yes, n for No) ");
		    run = cont.next().charAt(0);
		}while(run != 'n');
	}
}