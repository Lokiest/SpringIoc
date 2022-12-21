package ex08;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Bean;

//Config Ŭ������ ȯ�漳������ ����Ѵٴ� �ǹ��� ������̼�
@Configuration
public class Config {
	//�������� �⺻������ ���� �̱��水ü(���ϰ�ü)�� ���� >> default >> Scope���� ��������
	
	@Bean(name="e1")
	@Scope(value="prototype") 
	public Emp empInfo() {
		return new Emp("king", "manager", 7000);
	}
	
	//Bean�� name�Ӽ� ���ָ� �� �̸��� �޼��� �̸��� ��name�� ��
	@Bean
	public Emp empInfo2() {
		Emp e = this.empInfo();
		e.setName("Queen");
		e.setDept("Admin");
		e.setSalary(8000);
		return e;
	}
	
	//Emp�� ��ȯ�ϴ� �޼��� ����
	@Bean
	public Emp empInfo3() {
		return new Emp("Sherlock", "Detective", 5000);
	}
	
	//ServiceImpl �� ��ȯ�ϴ� �޼��� ����
	@Bean
	public ServiceImpl service() {
		ServiceImpl s = new ServiceImpl();
		s.setEmp(this.empInfo3());
		return s;
	}
}
