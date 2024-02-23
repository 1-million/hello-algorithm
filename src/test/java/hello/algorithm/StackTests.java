package hello.algorithm;

import org.junit.Test;

import java.util.Stack;

/**
 * @author qr
 * 2024年02月23日 14:32
 */
public class StackTests {

    @Test
    public void test(){
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        s1.push("浏览页1");
        s1.push("浏览页2");
        s1.push("浏览页3");
        System.out.println(s1);
        System.out.println(s2);
        String s = s1.pop();
        s2.push(s);
        System.out.println("退回到上一页:"+s);
        System.out.println(s1);
        System.out.println(s2);
        s = s2.pop();
        s1.push(s);
        System.out.println("前进到上一页:"+s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
