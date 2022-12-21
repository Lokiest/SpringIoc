package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//IoC : ������� ������ �����̳ʰ� ���� ��

public class HelloAppSpring {

	public static void main(String[] args) {
		String config = "src/main/java/ex03/applicationContext.xml";
		
		//������ �����̳�
		ApplicationContext ctx = new FileSystemXmlApplicationContext(config);
		
		//DL : �޸𸮿� �ö��ִ� ��ü�� �̸����� ã�� ��
		//MessageBean mb = (MessageBean)ctx.getBean("mbKo");
		MessageBean mb = (MessageBean)ctx.getBean("mbEn");
		mb.sayHello("Spring");
	}

}
