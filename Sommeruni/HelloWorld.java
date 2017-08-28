import java.util.Date;
import java.io.*;
public class HelloWorld {
	public static void main(String[]args){
		System.out.println("Anmeldung\n-----------------------------------");
		String user = "Ranger";
		String password = "xyz";
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Username: ");
			String eingabe = br.readLine();
			System.out.println("Passwort: ");
			String eingabe2 = br.readLine();

			if(user.equals(eingabe) && password.equals(eingabe2)){
				System.out.println("Deine Anmeldedaten sind korrekt");
			}
			else{
				System.out.println("Du besitzt keine Autorisierung");
			}
		}
		catch(Exception e){
			System.out.println("Fehler Bei der Eingabe");
		}
	}
}
