package sortAlgorithm;
/*
快速排序
A选取第一个元素为标准元素存放在temp中
B比较标准元素和数组右端元素
 标准元素小于等于右端元素，右端下标j--
 否则将右端元素放至a[i],i++
C比较标准元素和数组左端元素
 标准元素大于左端元素，左端下标i++
 否则将左端元素放至a[j],j--
D重复步骤B、C知道i等于j,此时一次排序完成
E对左子集合进行快速排序
F对右子集合进行快速排序
整个快速排序过程完成
*/
public class QuickSort {
    public static void quickSort(int[] a, int low, int high) {
        int i, j;
        int temp;
        i = low;
        j = high;
        temp = a[low];//取第一个元素为标准数据元素
        while (i < j) {
            //在数组右端扫描
            while (i < j && temp <= a[j])
                j--;
            if (i < j) {
                a[i] = a[j];
                i++;
            }

            //在数组左端扫描
            while (i < j && a[i] < temp)
                i++;
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = temp;
        if(low<i)quickSort(a,low,i-1);//对左端子集合递归
        if(i<high)quickSort(a,j+1,high);//对右端子集合递归
    }

    public static void main(String[] args) {
        int[] a = {25,48,65,32,14,9,21,6};
        quickSort(a,0,7);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
