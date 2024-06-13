package com.testspringmvc.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.testspringmvc.model.User;


//iss taraha hamko UserDao ko ya batane key liye ki yah eaak Dao hai ju data acess layer ka object hai 
//ju data ko access karha aaur data ko database ma save kar raha hai tu iss liye yaha per hamko used karna hai
//@Repository tu spring continer samajh jayega ki mujhe  UserDao class ka object create karkey mughe inject karnahi jaha bhi
//autowiring huwa hai aaur yah eaak database liyer ki database object hai ju ki data ko save kar rahi hugi aaur la rahi hugi
//but aapko ya chij xml declear nahi karni padegi

@Repository // Indicating that this is a repository bean
public class UserDao {
     
	
	//sare object inject hujayega but  aap na ju  UserDao class ma ju hibernateTemplate used kiya hai ussko kaha aapne define kiay hai
	//aaur na tu aapne hibernateTemplate ma Repositry used kiya hai aaur na tu kahi service used kiya hai tu Autowire kaise huga ya tu 
	//ham xml used karkey ya tu java used karkey 
	//sabse aacha way ha ki ham xml used kar key declare kardate hai tu hamko (spring-servlet.xml)ma karna huga  
    @Autowired
    private HibernateTemplate hibernateTemplate;
    //iss ka work <!-- Step(2) -->
    @Transactional //iss ka ham used karte hai writing mode key liye taki hamara data save hu paye hamare database ma aaur iss ka connectvity hai spring-servlet.xml file ma
	public int saveUser(User user) {/* ya call huwa hai transactionManager wale part per(step1) */
    	
        // Using Integer directly as it is returned by save
        int id = (Integer) hibernateTemplate.save(user);
        return id;
        //Step(3 ) phir hibernateTemplate call huga ju user laker jayega ju save kara dega aap 
        //key database ma
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

