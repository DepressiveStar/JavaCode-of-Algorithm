package sortAlgorithm;
/*
* 直接选择排序
* 从待排序的数据元素集合中选取最小的数据元素
* 将其与原始数据元素集合中的第一个数据元素交换位置
* 从不包括第一个位置上数据元素的集合中选取最小的数据元素
* 将其与原始数据元素集合中的第二个数据元素交换位置
* 重复以上步骤，直到数据元素集合中只剩一个数据元素为止
* */
public class SelectSort {
    public static void selectSort(int[] a){
        int i,j,small;
        int temp;
        int n = a.length;
        for(i=0;i<n-1;i++){
            small = i;//设第i个数据元素最小
            for(j=i+1;j<n;j++){//寻找最小的数据元素
                if(a[j]<a[small])
                    small=j;//记住最小元素的下标
            }
            if(small!=i){//当最小元素的下标不为i时交换位置
                temp = a[i];
                a[i] = a[small];
                a[small] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {25,48,65,32,14,9,21,6};
        selectSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

}
