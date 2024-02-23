package hello.algorithm;

import hello.algorithm.structure.Node;
import hello.algorithm.structure.PlayerNode;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author qr
 * 2024年02月23日 9:53
 */
public class LinkedListTests {
    @Test
    public void insertTest(){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n0);
        //初始化 新元素
        Node p = new Node(2);
        //p节点的next指向右边节点，左边节点的next指向p节点。
        p.setNext(n2);
        n1.setNext(p);
        System.out.println(n0);
    }

    @Test
    public void deleteTest(){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n0);
        //删除元素
        Node p = n2;
        //p节点的左边节点的next指向p节点的右边节点
        n1.setNext(n3);
        System.out.println(n0);
    }

    @Test
    public void queryForIndex(){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n0);
        //索引
        int index = 3;
        //遍历指定的索引次数
        Node indexNode = n0;
        for(int i = 0;i<index;i++){
            indexNode = indexNode.getNext();
        }
        System.out.println(indexNode.getValue());
    }

    @Test
    public void queryForValue(){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n0);
        //遍历链表比较元素value
        //查找的值
        int value = 3;
        //定义位置变量
        Node temp = n0;
        for(int index = 0;temp!=null;index++){
            if(temp.getValue() == value){
                System.out.println(value+":index="+index);
            }
            temp = temp.getNext();
        }
    }

    @Test
    public void queryAll(){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        System.out.println(n0);
        //遍历链表比较元素value
        //查找的值
        int value = 3;
        //定义位置变量
        Node temp = n0;
        while (temp!=null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args){
        PlayerNode[] nodes = new PlayerNode[]{new PlayerNode("小张"),new PlayerNode("小白"),new PlayerNode("小兰"),new PlayerNode("笑笑"),new PlayerNode("小卡")};
        for(int i = 0;i<nodes.length-1;i++){
            nodes[i].setNext(nodes[i+1]);
        }
        nodes[nodes.length-1].setNext(nodes[0]);
        //指定开始节点
        PlayerNode head = nodes[3];
        //设置一个炸弹数字
        //int p = 86,v = 0;
        int p = new Random().nextInt(10000),v = 0;
        Scanner scanner = new Scanner(System.in);
        while (p != v) {
            //保存猜测数字
            System.out.print("当前玩家[" + head.getName() + "],开始猜测,猜测数字:");
            v = scanner.nextInt();
            if(p > v){
                System.out.println("当前玩家[" + head.getName() + "],开始猜测的数字小了.");
            }else if(p < v){
                System.out.println("当前玩家[" + head.getName() + "],开始猜测的数字大了.");
            }else{
                System.out.println("当前玩家[" + head.getName() + "],猜测数字[" + v + "]与炸弹[" + p + "]一致,爆炸而亡.");
            }
            head = head.getNext();
        }
    }
}
