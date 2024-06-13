package com.testspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testspringmvc.dao.UserDao;
import com.testspringmvc.model.User;

 // Add this annotation
//UserService class ko ya tu xml ma configuer karna padega ya Annotation used karna padega tabhi
//aapka Ayushi continer ju hai pahchan payega ki iss ko autowired karna hai ya file kaha rahti 
//aap banate hai WEB-INF string name spring then file name.xml (Example=spring-servlet.xml)
//Rule=Service class ko banane key liye ya matlab springContiner ko batane key liye ki yah eaak 
//service class hai tu hamlog used karte hai @Service Annotation tu khud samajh jayega ki yah eaak
//Service class hai
@Service
public class UserService {

    @Autowired 
    private UserDao userDao;

    public int createUser(User user) {
        return userDao.saveUser(user);
        //Step(2) yaha sa userDao call huga ju user laker jayega matlab UserDao key
        //aander ju hibernateTemplate hai wo call huga 
          
    }

}
