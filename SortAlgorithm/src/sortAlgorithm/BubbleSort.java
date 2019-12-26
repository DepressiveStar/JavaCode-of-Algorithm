package sortAlgorithm;
/*
* 冒泡排序
* 稳定性排序方法
* 设置flag标志位，若没有交换动作可提前结束排序过程
* */
public class BubbleSort {
    public static void bubbleSort(int[] a){
        int i,j,flag=1;//flag交换标志位
        int temp;
        int n=a.length;
        for (i=1;i<n&&flag==1;i++){
            flag = 0;
            for (j=0;j<n-i;j++){
                if (a[j]>a[j+1]){//双方交换
                    flag = 1;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
     int[] a = {25,83,64,5,74,6,19,30};
     bubbleSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");//遍历输出
        }
    }
}
