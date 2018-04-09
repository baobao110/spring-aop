package simple;

//纵向抽取机制
public class DataChange extends simple{

    public void add(){
        //业务逻辑
        //添加日志
        super.writeLogger();
    }

    public void delete(){
        //业务逻辑
        //添加日志
        super.writeLogger();
    }
}
//拓展功能，每当数据修改就添加日志，
// 这里采用的是AOP概念之前的纵向抽取机制其实就是继承，
// AOP采用的是横向抽取模式,计算方法的运行时间是环绕通知
//AOP使用了JDK动态代理