package simple;

import org.aspectj.lang.annotation.Before;

@org.aspectj.lang.annotation.Aspect
public class Aspect {
	
	//在方法上面使用注解的方式实现增强配置
	@Before(value = "execution(*  simple.Animal.add())")
	public void before() {
		System.out.println("-------before--------");
	}

}
