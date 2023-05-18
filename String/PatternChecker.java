package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {


		public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bufferedReader.readLine());
	        String[] syntax = new String[n];
	        for (int i = 0; i < syntax.length; i++) {
	            syntax[i] = bufferedReader.readLine();
	        }
	        for (int i = 0; i < syntax.length; i++) {
	            try {
	                Pattern pattern = Pattern.compile(syntax[i]);
	                System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
	                System.out.println("Invalid");
	            }
	        }
	    }
}
