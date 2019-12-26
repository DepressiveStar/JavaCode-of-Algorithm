package sortAlgorithm;
/*
* 堆排序：将待排序数据元素集合构造成完全二叉树结构
* A把堆顶a[0]元素和当前最大堆的最后一个元素交换
* B最大堆元素个数减1
* C调整根结点使之满足最大堆定义
*
* */
public class HeapSort {
    //创建堆
    public static void createHeap(int[] a,int n,int h){
        int i,j,flag;
        int temp;
        i = h;//i为要建堆的二叉树结点下标
        j = 2*i+1;//j为i结点的左孩子结点的下标
        temp = a[i];
        flag = 0;
        //沿左右孩子中值较大者重复向下筛选
        while(j<n&&flag!=1){
            //寻找左右孩子结点中的较大者,j为其下标
            if(j<n-1&&a[j]<a[j+1])
                j++;
            if(temp>a[j])//a[i]>a[j]
                flag=1;//标记结束筛选条件
            else{//否则把a[j]上移
                a[i] = a[j];
                i = j;
                j = 2*i+1;
            }
        }
        a[i] = temp;//把最初的a[i]赋予最后的a[j]
    }
    //初始化堆
    public static void initCreateHeap(int[] a){
        int n = a.length;
        for(int i=(n-1)/2;i>=0;i--){
            createHeap(a,n,i);
        }
    }
    //堆排序算法
    public static void heapSort(int[] a){
        int temp;
        int n = a.length;
        initCreateHeap(a);//初始化创建最大值
        for(int i=n-1;i>0;i--){//当前最大堆个数每次递减1
            //把堆顶a[0]元素和当前最大堆的最后一个元素交换
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            createHeap(a,i,0);//调整根结点满足最大堆
        }
    }

    public static void main(String[] args) {
        int[] a = {25,48,65,32,14,9,21,6};
        heapSort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
