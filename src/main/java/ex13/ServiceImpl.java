package ex13;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

//������̼��� ���� �����ϴ� ��� : �⺻�ڷ��� ���� ������ ���� Value() ���
/* @Value :�⺻�ڷ���, String ������ ������ �� ���
 * @Autowired : byType���� �����Ѵ�. �ڷ������� ���� ��ü�� ������ �����Ѵ�. ã�¼���: �ڷ���> @Qualifier("���̸�")
 * @Resource  : byName���� �����Ѵ�.
 * @Inject : ==>pom.xml�� ���̺귯���� ����ؾ� ��� �����ϴ�. byType> @Qualifier
 * 
 * */

public class ServiceImpl implements Service {
	
//	@Autowired //>> ���� 2�� �̻��� ���, �ĺ��� �� �ְ� @Qualifier
//	@Qualifier("emp1")
	@Resource(name="emp1")
	private Emp emp;
	
//	@Autowired
	@Inject
	private Member user;

	@Override
	public void test1() {
		System.out.println("================Emp================");
		System.out.println(emp);
	}

	@Override
	public void test2() {
		System.out.println("================Member================");
		user.showInfo();
	}

}
