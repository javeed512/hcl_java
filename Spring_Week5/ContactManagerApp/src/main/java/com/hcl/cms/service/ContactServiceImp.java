package com.hcl.cms.service;

import com.hcl.cms.beans.Contact;

public class ContactServiceImp implements IContactService {

	IContactDao dao = null;
	
	public ContactServiceImp() {
		
		
		dao = new ContactDaoImp();
	}
	
	
	@Override
	public int addContact(Contact contact) {
		// TODO Auto-generated method stub
		return dao.addContact(contact);
	}

}
