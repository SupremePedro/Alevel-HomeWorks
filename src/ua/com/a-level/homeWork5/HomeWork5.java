package ua.com.alevel;

public class HomeWork5 {
    public static void main(String[] args) {
        int [] arr = {6,5,3,1,8,7,2,4};
        int [] sortedArray = mergeAndSort(arr);
        System.out.println("Sorted array: ");
        for(int element:sortedArray){
            System.out.print(element+" ");
        }
    }
    public static int[] mergeAndSort(int [] arr){
        System.out.println("Start merge and sort!!!");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        //разделение
        int[] newArr = new int[arr.length];


        if(arr.length>1) {
            // слияние
            int middle = arr.length / 2;
            int[] leftArr = new int[middle];
            for (int i = 0; i < leftArr.length; i++) {
                leftArr[i]=arr[i];
            }
            System.out.println("Left arr :");
            for(int element:leftArr){
                System.out.print(element+" ");
            }
            System.out.println();
            int [] sortedLeft = mergeAndSort(leftArr);
            System.out.println("SortedLeft arr :");
            for(int element:sortedLeft){
                System.out.print(element+" ");
            }
            System.out.println();

            int[] rightArr = new int[arr.length-middle];
            for (int i = 0; i < rightArr.length; i++) {
                rightArr[i]=arr[middle+i];
            }
            System.out.println("Right arr :");
            for(int element:rightArr){
                System.out.print(element+" ");
            }
            System.out.println();

            int [] sortedRight = mergeAndSort(rightArr);
            System.out.println("SortedRight arr :");
            for(int element:sortedRight){
                System.out.print(element+" ");
            }
            System.out.println();
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < sortedLeft.length && j < sortedRight.length) {
                if (sortedLeft[i] <= sortedRight[j]) {
                    newArr[k] = sortedLeft[i];
                    k++;
                    i++;
                } else {
                    newArr[k] = sortedRight[j];
                    k++;
                    j++;
                }

            }
            while (i < sortedLeft.length) {
                newArr[k] = sortedLeft[i];
                i++;
                k++;

            }
            while (j < sortedRight.length) {
                newArr[k] = sortedRight[j];
                j++;
                k++;
            }
        }else {
            newArr = arr;
        }
        System.out.println("End method");
        return newArr;

    }
}
