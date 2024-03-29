
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

import JavaFundamentals2.Classes.Initializers.IntialDemo;
import Models.Constructor;
import Models.Material;
import Models.Subject;

import Models.Pair;

public class MyConsoleApp
 {
    public static void main(String[] args) {
        
     Locale.setDefault(new Locale("EN"));

        try (Scanner sc = new Scanner(System.in)) {
          
        	//input material’s name and density
        String materialname = sc.next();
        double materialDensity = sc.nextDouble();

        	//input subject’s name and volume
        	
        	String subjectName = sc.next();
        	double subjectVolume = sc.nextDouble();

        Material material = new Material(materialname,materialDensity);

        	//create a Subject instance that consists of the given material with input values 
          Subject subject = new Subject(subjectName,material,subjectVolume);
          
          System.out.println(subject);

          
          
          subject.setMaterial(new Material("Cooper",8500.0));

          var str = subject.getMass();
          
          System.out.printf("%.2f%n", subject.getMass());

          
        	//output a Subject instance

        	//update a subject material by the "copper" whose density is 8500.0

        	//output the mass of the updated subject to 2 decimal places after a space character

        }


   }
 }