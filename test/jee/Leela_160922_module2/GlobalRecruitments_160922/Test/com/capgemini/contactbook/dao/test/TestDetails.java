package com.capgemini.contactbook.dao.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
import com.capgemini.contactbook.dao.ContactBookDao;
import com.capgemini.contactbook.dao.ContactBookDaoImpl;
import com.capgemini.contactbook.exception.ContactBookException;
 
import com.igate.contactbook.bean.EnquiryBean;

public class TestDetails 
{
	ContactBookDaoImpl dao=null;
	
	@Before
	public void setUp() {
		dao = new ContactBookDaoImpl();
	}
 

	@After
	public void tearDown() {
		dao = null;
	}

	@Test
	public void testgetId() {
		EnquiryBean enquiries = new EnquiryBean();
		enquiries.setContactNo("9898990004");
		enquiries.setfName("Ranbir");
		enquiries.setlName("Gupta");
		enquiries.setpDomain("Java");
		enquiries.setpLocation("Pune");
 
		try {
			Integer id = dao.addEnquiry(enquiries);
			assertNotNull(id); 
		}
		catch (ContactBookException e) {
			e.printStackTrace();
		}
}
 
}