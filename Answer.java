import java.util.*;
import java.io.*;
import java.awt.*;

public class Answer {

	public String read_in(String input_file, int choice) {
		String[] problem = input_file.split("\\s+");
		try(Scanner keys = new Scanner(new FileReader(keyword.txt))){
			String all_keys;
			int line = 0;
			while(keys.hasNextLine()) {
				if(line == choice){
					all_keys = keys.nextLine();
					break;
				}
				keys.nextLine();
				line++;
			}
			String[] category = all_keys.split(" : ");
			String[] response1 = category[0].split(",");
			String[] response2 = category[1].split(",");
			for(int i=0; i<problem.length; i++){
				if(Arrays.asList(response1).contains(problem.toLowerCase())){
					return reply(choice*2);
				}else if(Arrays.asList(response2).contains(problem.toLowerCase())){
					return reply(choice*2 +1);
				}
			}
			return reply(30);
		}catch(Exception e) {
			system.out.println("Failed");
			return "-1";
		}
	}

	public void reply(int response){
		if(response == 0){
			return ("0");
		}else if(response == 1){
			return ("1");
		}else if(response == 2){
			return ("2");
		}else if(response == 3){
			return ("3");
		}else if(response == 4){
			return ("4");
		}else if(response == 5){
			return ("5");
		}else if(response == 6){
			return ("6");
		}else if(response == 7){
			return ("7");
		}else if(response == 8){
			return ("8");
		}else if(response == 9){
			return ("9");
		}else if(response == 10){
			return ("10");
		}else if(response == 11){
			return ("11");
		}else if(response == 12){
			return ("12");
		}else if(response == 13){
			return ("13");
		}else if(response == 14){
			return ("14");
		}else if(response == 15){
			return ("15");
		}else if(response == 16){
			return ("16");
		}else if(response == 17){
			return ("17");
		}else if(response == 18){
			return ("18");
		}else if(response == 19){
			return ("19");
		}else if(response == 20){
			return ("20");
		}else if(response == 21){
			return ("21");
		}else if(response == 22){
			return ("22");
		}else if(response == 23){
			return ("23");
		}else if(response == 24){
			return ("24");
		}else if(response == 25){
			return ("25");
		}else if(response == 26){
			return ("26");
		}else if(response == 27){
			return ("27");
		}else if(response == 28){
			return ("28");
		}else if(response == 29){
			return ("29");
		}else if(response == 30){
			return ("30");
		}
	}

	public static void main(String[] args){
		system.out.println(read_in("raw", 0));
	}
}









