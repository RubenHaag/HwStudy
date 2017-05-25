import java.lang.String;
import java.lang.Math.*;
class Hashing{

	int hashfunktion(String s){
		if (s.isEmpty()){
			return 0;
		}
		int x = 0;
		char [] c = s.toCharArray();
		int l = s.length();
		for(int i = 0; i < l; i++){
			x += ((int) c[i]) * (int)Math.pow(31, l-1);
		}
		return x;
	}

}