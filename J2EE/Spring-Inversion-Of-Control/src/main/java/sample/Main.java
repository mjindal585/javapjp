package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		Player p=cxt.getBean("player2",Player.class);
		System.out.println(p);
	}
}
