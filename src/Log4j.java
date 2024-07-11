/**
 * @ClassName Log4j
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-08 17:14
 * @Version 1.0
 **/
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
    public static Logger logger = LogManager.getLogger(Log4j.class);
    public static void main(String[] args) {
        logger.debug("这是debug级别的日志");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2 = in.nextInt();
        System.out.printf("%d / %d = %d%n", num1, num2, num1/ num2);
        System.out.println("感谢使用本程序！");
    }
}

