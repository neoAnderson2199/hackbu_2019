package hackbu_2019;

import java.util.*;
import java.io.*;
import java.awt.*;

public class Answer {

	public static String read_in(String input_file, int choice) {
		String[] problem = input_file.split("\\s+");
		try(Scanner keys = new Scanner(new FileReader("./hackbu_2019/keyword.txt"))){
			String all_keys = null;
			int line = 0;
			while(keys.hasNextLine()) {
				if(line == choice){
					all_keys = keys.nextLine();
					break;
				}
				keys.nextLine();
				line++;
			}
			if(all_keys != null){
				String[] category = all_keys.split(" : ");
				String[] response1 = category[0].split(",");
				String[] response2 = category[1].split(",");
				for(int i=0; i<problem.length; i++){
					if(Arrays.asList(response1).contains(problem[i].toLowerCase())){
						return reply(choice*2);
					}else if(Arrays.asList(response2).contains(problem[i].toLowerCase())){
						return reply(choice*2 +1);
					}
				}
				return reply(29);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		return "-1";
	}

	public static String reply(int response){
		Random rand = new Random();
		if(response == 0){
			return ("You should instead try buying food from the off campus or cooking for yourself.");
		}else if(response == 1){
			return ("Maybe you should try adding some soysauce because that makes very thing taste better.");
		}else if(response == 2){
			return ("Wow sounds serious. You should really tell someone about that.");
		}else if(response == 3){
			return ("Well that is not healthy so don't do it");
		}else if(response == 4){
			return ("Stop with the exercise. Just learn to love what you look like.");
		}else if(response == 5){
			return ("Just eat Cheerios to be happy and be healthy.");
		}else if(response == 6){
			return ("Eww, here's what we'll do. Tell everyone to move out and we'll burn down the building.");
		}else if(response == 7){
			return ("I understand. We will be sure to send someone over with duct tape.");
		}else if(response == 8){
			return ("Ok, just text this number: (555)NOT-LOST with your credit card information.");
		}else if(response == 9){
			return ("So you want to just throw that out and buy a new one.");
		}else if(response == 10){
			return ("I'm sorry I don't understand, but I'm sure everything is fine.");
		}else if(response == 11){
			return ("Well I am sure that they are smarter than you so stop complaining.");
		}else if(response == 12){
			return ("What ever you kids in your private time is not a concern for us.");
		}else if(response == 13){
			return ("The best advice we can give you is to learn to fight and settle this yourselves.");
		}else if(response == 14){
			return ("You should really be contacting your teacher for this information.");
		}else if(response == 15){
			return ("Stick with it. I know you can make it.");
		}else if(response == 16){
			return ("You need to think about that your self. We are not supposed to be telling you how to live your life.");
		}else if(response == 17){
			return ("I really want to help you, but with your grades ...");
		}else if(response == 18){
			return ("Well it is too late to move you. So all we can tell you is that you should think about living off campus next semester.");
		}else if(response == 19){
			return ("You should just go join in the fun, you party pooper.");
		}else if(response == 20){
			return ("We can't force you to do anything, so decide for yourself what you want to do.");
		}else if(response == 21){
			return ("You know what you should make some more friends and do stuff with them.");
		}else if(response == 22){
			return ("Ohh you have no money. That's great news. We needed more room for residents.");
		}else if(response == 23){
			return ("Yes we can exchange your money for you just email all your information to us.");
		}else if(response == 24){
			return ("Were you making food?");
		}else if(response == 25){
			return ("What you want to do is lock yourself in your room and quarantine yourself.");
		}else if(response == 26){
			return ("If you are so worried about that stuff just drive yourself.");
		}else if(response == 27){
			return ("If you are so worried about that don't bring your car.");
		}else if(response == 28){
			return ("Why are you even on this if you don't have an issue?");
		}else if(response == 29){
			int num = rand.nextInt(5);
			if (num == 0){
				return ("I do not understand your issue can you explain it more.");
			}else if(num == 1){
				return ("Haha. You call that an issue?");
			}else if(num == 2){
				return ("And you think I can solve that?");
			}else if(num == 3){
				return ("Well that's not my problem.");
			}else{
				return ("Good luck to you.");
			}
		}else if(response == 30){
			return ("Invalid input.");
		}
		return "-1";
	}
}









