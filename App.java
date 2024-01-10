package com.hibernate.manytomany.lazytoeager.Many_To_Many_LaztToEager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		Coconut c=new Coconut();
		c.setcCount(10);
		c.setcPrice(450);

		Coconut c1=new Coconut();
		c1.setcCount(20);
		c1.setcPrice(900);

		Coconut c2=new Coconut();
		c2.setcCount(30);
		c2.setcPrice(1350);

		Coconut c3=new Coconut();
		c3.setcCount(40);
		c3.setcPrice(1800);
		

		CoconutTree ct=new CoconutTree();
		ct.settCount(47);
		ct.settHight(18.7);

		CoconutTree ct1=new CoconutTree();
		ct1.settCount(58);
		ct1.settHight(22.60);

		CoconutTree ct2=new CoconutTree();
		ct2.settCount(89);
		ct2.settHight(56.09);
		
		
		// need to set values to extra created table 
		
		
	

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Coconut.class).addAnnotatedClass(CoconutTree.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();


//		Coconut coconut=session.load(Coconut.class, 10);
//		System.out.println(coconut);
//
//		Coconut coconut1=session.load(Coconut.class, 20);
//		System.out.println(coconut1);
//
//		Coconut coconut2=session.load(Coconut.class, 30);
//		System.out.println(coconut2);
//
//		CoconutTree coconutTree=session.load(CoconutTree.class, 47);
//		System.out.println(coconutTree);
//
//		CoconutTree coconutTree1=session.load(CoconutTree.class, 58);
//		System.out.println(coconutTree1);
//
//		CoconutTree coconutTree2=session.load(CoconutTree.class, 89);
//		System.out.println(coconutTree2);
//
//
		List<Object> lists =new ArrayList<Object>();
		lists.add(c);
		lists.add(c2);
		lists.add(c3);
		lists.add(ct);
		lists.add(ct1);
		lists.add(ct2);

		for(Object  li: lists)
		{
			session.save(li);
			System.out.println(li);

		}

		trans.commit();
		session.close();

	}
}
