package org.train.annotation1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * description
 *
 * @author zhaolinjie 2021/01/26 15:42
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建计算器的对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件对象
        Class c = calculator.getClass();
        //3.获取所有的方法
        Method[] methods = c.getMethods();

        int number = 0; //记录异常的次数
        //将捕获的异常信息加载到该txt文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Temp\\注解测试.txt"));
        for (Method method : methods){
            //4.判断方法上是否有注解
            if(method.isAnnotationPresent(Check.class)){
                //5.有则执行

                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.捕获异常

                    //将异常信息记录到文件
                    number++;
                    bw.write(method.getName()+"方法出异常"); //获取方法名
                    bw.newLine();
                    bw.write("异常名称："  + e.getCause().getClass().getSimpleName()); //获取不带包名的异常类名称
                    bw.newLine();
                    bw.write("异常原因："  + e.getCause().getMessage());
                    bw.newLine();
                }
            }
        }
        bw.write("测试异常个数为："  + number +"个");
        bw.flush();
        bw.close();
    }
}
