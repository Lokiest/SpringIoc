package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/* ������ �����̳� : ���� �����Ѵ�.
 * 			     ������ �����̳ʴ� �� ��ü�� �����ϰ� ������, �� ��ü���� ���� ���踦 �������ش�.
               BeanFactory�� ApplicationContext�� �����̳� ������ �����ϴ� �������̽�
 * 1 BeanFactory (�������̽�)
 * 2 ApplicationContext (BeanFactory �� ��ӹ��� ���� �������̽�.)
 * 3 WebApplicationContext (�������̽�. �� ���ø����̼��� ���� ApplicationContext��.
         �ϳ��� ������(��, �ϳ���ServletContext) ���� �� �� �̻��� WebApplicationContext�� ���� �� �ִ�).
 * 
 * DI(dependency Injection) : ������ ����
 * 1 ��ü ���� ���踦 �����ϰ� �����ϵ��� ���ִ� ��� ���� �ϳ�.
 * 2 �����Ǵ� ��ü�� ���������� �����ϴ� ��ü���� �������� �ʰ� 
 * �����̳ʿ��� ������ �ؼ� ����ϴ� ����̴�. 
 * 
 * - FileSystemXmlApplicationContext
 *- ClassPathXmlApplicationContext
 *- AnnotationConfigApplicationContext
 *
 */

public class HelloSpringApp {

	public static void main(String[] args) {
		String resource = "src/main/java/ex04/appContext.xml";
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext(resource);
		//ctx : ������ �����̳�
		Message msg = ctx.getBean("mb1", Message.class);
		msg.sayHello();
		msg.sayHi("scubi", "black", "yankee", "bro");
		msg.sayHi("just one");
		
		
		Message msg2 = ctx.getBean("mb2", Message.class);
		msg2.sayHello();
		msg2.sayHi("scubi", "black", "yankee", "bro");
		msg2.sayHi("just one");
	}

}
