package com.cecum.pf;

import java.util.*;

import com.cecum.otherlibs.OutsiderLib;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	
       System.out.println( "Hello World!" );
       List<String> sierEmail = new LinkedList<>();
       sierEmail.add("pepito@gmail.com");
////        
//        MutablePerson person1 = new MutablePerson();
//        person1.setEmails(sierEmail);
//        person1.setFirstName("Pepito");
//        person1.setLastName("Perez");
////        
//        System.out.println(person1);
//        OutsiderLib.badFunction(person1);
//        System.out.println(person1);
////        
//        
//        System.out.println("///////////////////////////////");
//       MutablePerson_2 sinuhe = new MutablePerson_2(sierEmail);
//       System.out.println(sinuhe);
//       OutsiderLib.otherBadFunction(sinuhe);
//       System.out.println(sinuhe);
//        
//        
//        System.out.println("///////////////////////////////");
//        MutablePerson_3 sinuhe_3 = new MutablePerson_3(sierEmail);
//        System.out.println(sinuhe_3);
//        OutsiderLib.otherBadFunctionPart3(sinuhe_3);
//        System.out.println(sinuhe_3);
//        
//        System.out.println("///////////////////////////////");
//        MutablePerson_3 sinuhe_4 = new MutablePerson_4(sierEmail);
//        System.out.println(sinuhe_4);
//
//
//        System.out.println("///////////////////////////////");
//        String firstName = "Sinuhe";
//        String lastName = "Jaime";
//        List<String> emails = new LinkedList<>();
//        emails.add("sier@sier.com");
////        
//        ImmutablePerson sier = new ImmutablePerson(firstName, lastName, emails);
//        System.out.println(sier);
//        OutsiderLib.badIntentionedMethod(sier);
//        System.out.println(sier);
    	
    	
       Function<Integer, Integer> triple = new Function<Integer, Integer>(){

		@Override
		public Integer apply(Integer t) {
			// TODO Auto-generated method stub
			return t*t*t;
		}
		
       };
       
		System.out.println(triple.apply(3));
		
		
//    	Function<Integer, Integer> cuadrado = new Function<Integer, Integer>(){
//
//			@Override
//			public Integer apply(Integer t) {
//				// TODO Auto-generated method stub
//				return t*t;
//			}
//    		
//    	};
//    	
//    	System.out.println(cuadrado.apply(10));
    	
    	Function<Integer, Boolean> isOdd = x -> x%2 ==1; //mas legible
    	
    	Predicate<Integer> esPar = x -> x%2 ==0; // Funciones predicado
    	
    	esPar.test(5);
    	
    	
    	
        
        
        
        
        
    }
}
