package hello.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author qr
 * 2024年02月22日 20:15
 */
public class ArrayTests {
    @Test
    public void testInit(){
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testInsert(){
        //初始数组数据,长度7，最大索引6
        int[] arr = new int[]{1,2,3,5,6,7,0};
        System.out.println(Arrays.toString(arr));
        //插入元素
        int el = 4;
        //插入位置
        int index = 3;
        //2.其后元素后移一位
        //arr[6] = arr[5];
        //arr[5] = arr[4];
        //arr[4] = arr[3];
        //优化
        for(int i = arr.length-1;i>index;i--){
            arr[i] = arr[i-1];
        }
        //3.插入到指定位置
        arr[index] = el;
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testDelete(){
        //初始数组数据,长度7，最大索引6
        int[] arr = new int[]{1,2,3,5,6,7,0};
        System.out.println(Arrays.toString(arr));
        //删除位置
        int index = 3;
        //删除位置其后的元素向前移一位
        //arr[3] = arr[4];
        //arr[4] = arr[5];
        //arr[5] = arr[6];
        //优化
        for(int i = index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testQueryForIndex(){
        //初始数组数据,长度7，最大索引6
        int[] arr = new int[]{1,2,3,5,6,7,0};
        System.out.println(Arrays.toString(arr));
        //按指定索引位置查询
        int index = 3;
        System.out.println(arr[index]);
    }

    @Test
    public void testQueryForEl(){
        //初始数组数据,长度7，最大索引6
        int[] arr = new int[]{1,2,3,5,6,7,0};
        System.out.println(Arrays.toString(arr));
        //按指定索引位置查询
        int el = 5;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == el){
                System.out.println("el:"+el+",index:"+i);
            }
        }
    }
}
