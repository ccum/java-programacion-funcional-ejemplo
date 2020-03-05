package com.cecum.otherlibs;

import java.util.LinkedList;
import java.util.List;

import com.cecum.pf.ImmutablePerson;
import com.cecum.pf.MutablePerson;
import com.cecum.pf.MutablePerson_2;
import com.cecum.pf.MutablePerson_3;

public class OutsiderLib {
	
	public static void badFunction(MutablePerson person) {
        List<String> emails = new LinkedList<>();
        emails.add("imnotevil@mail.com");

        person.setEmails(emails);
    }
	
	public static void otherBadFunction(MutablePerson_2 person) {
        List<String> emails = person.getEmails();
        emails.clear();

        emails.add("imnotevil@mail.com");
    }
	
	
	public static void otherBadFunctionPart3(MutablePerson_3 person) {
        List<String> spammyEmails = new LinkedList<>();
        spammyEmails.add("tubanco@mibanco.banco.com");
        spammyEmails.add("cheapfoods@blackmarket.com");

        List<String> emails = person.getEmails();
        emails.clear();

        emails.add("imnotevil@mail.com");
        emails.addAll(spammyEmails);
    }
	public  static void badIntentionedMethod(ImmutablePerson person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotthebadguy@mail.com");
    }
	

}
