package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Starter {

	public static void main(String[] args) {
		// Typical Object Creation
		Student stu = new Student();
		System.out.println("stu = " + stu);
		stu.setId(10);
		stu.setName("ABC");
		stu.setEmail("abc@gmail.com");
		System.out.println("stu =" + stu);

		Student stu2 = new Student(11, "xyz", "xyz@gmail.com");
		System.out.println("stu2=" + stu2);

		// Spring way1
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student stu3 = (Student) factory.getBean("s1");
		System.out.println("stu3=" + stu3);

		// Spring way2
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu4 = (Student) context.getBean("s2");
		System.out.println("stu4 = " + stu4);

		Student stu5 = (Student) context.getBean("s3");
		System.out.println("stu5 =" + stu5);
	}

}
