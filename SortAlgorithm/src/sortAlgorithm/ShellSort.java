package sortAlgorithm;
/*
* 希尔排序：
* 将待排序元素分组，同组内元素用直接插入法排序
* 小组个数逐渐减少，所有元素在同一组内排序后，排序过程结束
* 跳跃式插入排序
* 不稳定性排序
* */
public class ShellSort {
    public static void shellSort(int[] a,int[] d,int numOfD){
        int i,j,k,m,span;
        int temp;
        int n = a.length;
        for (m=0;m<numOfD;m++){//循环numOfD次
            span = d[m];//取本次增量值
            for(k=0;k<span;k++){//共span个小组
                for (i=k;i<n-span;i=i+span){//每一小组进行直接插入排序
                    temp = a[i+span];
                    j=i;
                    while (j>-1&&temp<=a[j]){
                        a[j+span]=a[j];
                        j=j-span;
                    }
                    a[j+span] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
     int[] a = {64,34,25,87,12,8,56,46,14,77,92,23};
     int[] d = {6,2,1};
     shellSort(a,d,d.length);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");//遍历输出
        }
    }
}
