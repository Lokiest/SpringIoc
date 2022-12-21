package ex08;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Bean;

//Config 클래스를 환경설정으로 사용한다는 의미의 어노테이션
@Configuration
public class Config {
	//스프링은 기본적으로 빈을 싱글톤객체(단일객체)로 생성 >> default >> Scope으로 수정가능
	
	@Bean(name="e1")
	@Scope(value="prototype") 
	public Emp empInfo() {
		return new Emp("king", "manager", 7000);
	}
	
	//Bean에 name속성 안주면 빈 이름은 메서드 이름이 빈name이 됨
	@Bean
	public Emp empInfo2() {
		Emp e = this.empInfo();
		e.setName("Queen");
		e.setDept("Admin");
		e.setSalary(8000);
		return e;
	}
	
	//Emp빈 반환하는 메서드 구성
	@Bean
	public Emp empInfo3() {
		return new Emp("Sherlock", "Detective", 5000);
	}
	
	//ServiceImpl 빈 반환하는 메서드 구성
	@Bean
	public ServiceImpl service() {
		ServiceImpl s = new ServiceImpl();
		s.setEmp(this.empInfo3());
		return s;
	}
}
