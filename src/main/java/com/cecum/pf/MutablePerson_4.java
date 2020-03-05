package com.cecum.pf;

import java.util.LinkedList;
import java.util.List;

public class MutablePerson_4 extends MutablePerson_3 {

	public MutablePerson_4(List<String> emails) {
		super(emails);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public List<String> getEmails() {
        List<String> spammyEmails = new LinkedList<>();
        spammyEmails.add("tubanco@mibanco.banco.com");
        spammyEmails.add("cheapfoods@blackmarket.com");

        return spammyEmails;
    }
	
}
