import com.sxy.po.Emp;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.lang.ref.PhantomReference;
import java.util.List;

public class Test {
    @org.junit.Test
    public void Test() {
        //1.获取SessionFactory 会话工厂
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        //2.获取生产会话  通过opensession 获取session对象
        Session session = sessionFactory.openSession();
        //3.开启一个事务
        Transaction transaction= session.beginTransaction();//不返回任何东西
        //4.执行查询 get(里面要查询的实体类型 参数)
        Emp emp = session.load(Emp.class, 1);
        System.out.println("emp ="+ emp);
       /* transaction.commit();//提交事务
        session.close();//关闭session
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();*/
        //4.1执行查询(查询单条数据)
        Emp emp1= session.load(Emp.class, 1);
        System.out.println("emp = "+emp);
        //4.3执行查询(查询单条数据)    hql语句
       /* Query query = session.createQuery("from emp where id=5");
        Object o=query.uniqueResult();//只针对于 以及知道只有一条语句时才能使用
        System.out.println("o = "+ o);*/
       String hqll="from emp where id=?";
       String hql2="from emp where id=: id";
       Query query =session.createQuery(hql2);
      // query.setParameter("id", 5);hql传值 占位符从0开始
        Object o=query.uniqueResult();//只针对于 以及知道只有一条语句时才能使用
        System.out.println("o = "+ o);
        //5.查询全部
        Query query1=session.createQuery("from com.sxy.po.Emp");
        List<Emp> list=query1.list();

        for ( Emp stu : list){
            System.out.println("emp ="+emp);
        }
        SQLQuery sqlQuery=session.createSQLQuery("select *from emp");
        sqlQuery.addEntity(Emp.class);
       List<Emp> list1 =sqlQuery.list();
       for (Emp stu: list){
            System.out.println("stu ="+stu);
        }
    }
    /*
     * 增加操作
     * */
    @org.junit.Test
    public  void  testInsert(){
        Emp stu=new Emp();

    }
    /*
    * 删除操作
    * */
    @org.junit.Test
    public  void testDelete(){
        // 删除根据id查询是否存在对象(entity) 再去删除
        Emp stu=session.get(Emp.class,);
        if(stu =null){
            Session.delete(stu);

        }
        /*
        * 如果查询到数据 那么执行 修改操作
        * 否则 执行添加操作
        * */
        public  void testSaveOrUpdate(){

        }
    }
}
