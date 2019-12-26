package sortAlgorithm;
/*
 * 直接插入排序：
 * 将待排序元素按其值大小插入到已排序元素子集合的适当位置
 * 稳定性排序
 * */
public class InsertSort {
    public static void insertSort(int[] a){
        int i,j,temp;
        int n=a.length;
        for (i=0;i<n-1;i++){
            temp = a[i+1];
            j = i;
            while (j>-1&&temp<=a[j]){//比较两者大小，若小于前一位，前一位置后，继续比较
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = temp;//若大于则保持原位置
        }
    }
    public static void main(String[] args) {
        int[] test = {64,5,7,89,6,24};
        int n = test.length;
        insertSort(test);
        for (int i=0;i<n;i++){
            System.out.print(test[i]+" ");//遍历输出
        }
    }
}
