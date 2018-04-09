package simple;

import org.aspectj.lang.ProceedingJoinPoint;

public class beFore {

    public beFore() {
    }
    
    //前置通知
    public void before(){
        System.out.println("前置增强");
    }
    
    //后置通知
    public void after(){
        System.out.println("后置增强");
    }
    
    //环绕通知
    public void round(ProceedingJoinPoint point) {
    	//方法之前
    	System.out.println("方法之前");
    	try {
    		//执行被增强的方法
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//方法之后
    	System.out.println("方法之后");
    }
}
