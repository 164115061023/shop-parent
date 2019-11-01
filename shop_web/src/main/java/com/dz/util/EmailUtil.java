package com.dz.util;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EmailUtil {

    private static String HOST_NAME;
    private static String USERNAME;
    private static String PASSWORD;
    private static String CHAR_SET;
    private static String FROM_EMAIL;
    static {

        try {
            Properties prop = new Properties();
            InputStream is = EmailUtil.class.getClassLoader().getResourceAsStream("Email.properties");
            prop.load(is);
            HOST_NAME = prop.getProperty(EmailCons.HOST_NAME);
            USERNAME = prop.getProperty(EmailCons.USERNAME);
            PASSWORD = prop.getProperty(EmailCons.PASSWORD);
            CHAR_SET = prop.getProperty(EmailCons.CHAR_SET);
            FROM_EMAIL = prop.getProperty(EmailCons.FROM_EMAIL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void sendSimpleEmail(String subject, String msg, String el){
        Email email = new SimpleEmail();
        email.setHostName(HOST_NAME);
        email.setAuthentication(USERNAME,PASSWORD);
        email.setCharset(CHAR_SET);

        try {
            email.setFrom(FROM_EMAIL);
            email.setSubject(subject);
            email.setMsg(msg);
            email.addTo(el);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

    public static void sendHTMLEmail(String subject, String msg, String el){
        HtmlEmail email = new HtmlEmail();
        email.setHostName(HOST_NAME);
        email.setAuthentication(USERNAME,PASSWORD);
        email.setCharset(CHAR_SET);

        //email.setTLS(true);
        try {
            email.setFrom(FROM_EMAIL);
            email.setSubject(subject);
            email.setHtmlMsg(msg);
            email.addTo(el);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }


}
