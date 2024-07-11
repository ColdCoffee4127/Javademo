import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName Test1
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-08 17:04
// * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        System.out.print("请输入课程代号(1-3之间的数字)：");
        Scanner x = new Scanner(System.in);

        try{
            int num = x.nextInt();
            switch (num){
            case 1:
                System.out.println("C#编程");
                break;
            case 2:
                System.out.println("Java编程");
                break;
            case 3:
                System.out.println("SQL基础");
                break;
            default:
                System.out.println("输入有误，请输入1-3之间的数字");
            }
        }catch (Exception e){
            System.out.println("请输入数字");
        }finally {
            System.out.println("欢迎提出建议！");
        }
    }
}
