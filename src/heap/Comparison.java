/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import static java.lang.Math.pow;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author user
 */
public class Comparison {
    private int[] Heap = new int[31];
    private int[] HeapCopy = new int[31];

    private int[] Heap1 = new int[127];
    private int[] HeapCopy1 = new int[127];

    private int[] Heap2 = new int[511];
    private int[] HeapCopy2 = new int[511];
    
    private int[] Heap3 = new int[1023];
    private int[] HeapCopy3 = new int[1023];
    
    private int[] Heap4 = new int[2047];
    private int[] HeapCopy4 = new int[2047];
    
    private int[] Heap5 = new int[8191];
    private int[] HeapCopy5 = new int[8191];    

    public Comparison()
    {
        initialiseArrays();
        
        HeapSort(Heap);
        HeapSort(Heap1);
        HeapSort(Heap2);
        HeapSort(Heap3);
        HeapSort(Heap4);
        HeapSort(Heap5);
        
        System.out.println();
        restoreArrays();
        
        Mergesortcast(Heap);
        Mergesortcast(Heap1);
        Mergesortcast(Heap2);
        Mergesortcast(Heap3);
        Mergesortcast(Heap4);
        Mergesortcast(Heap5);
        
        System.out.println();
        restoreArrays();
        
        Quicksortcast(Heap);
        Quicksortcast(Heap1);
        Quicksortcast(Heap2);
        Quicksortcast(Heap3);
        Quicksortcast(Heap4);
        Quicksortcast(Heap5);
        
        System.out.println();
        restoreArrays();
        
        InsertionSort(Heap);
        InsertionSort(Heap1);
        InsertionSort(Heap2);
        InsertionSort(Heap3);
        InsertionSort(Heap4);
        InsertionSort(Heap5);
        
        System.out.println();
        restoreArrays();

        SelectionSort(Heap);
        SelectionSort(Heap1);
        SelectionSort(Heap2);
        SelectionSort(Heap3);
        SelectionSort(Heap4);
        SelectionSort(Heap5);
        
        System.out.println();
        restoreArrays();

        BubbleSort(Heap);
        BubbleSort(Heap1);
        BubbleSort(Heap2);
        BubbleSort(Heap3);
        BubbleSort(Heap4);
        BubbleSort(Heap5);
    }
    
    private void initialiseArrays()
    {
        IntStream range = IntStream.rangeClosed(1, 16000);
        List<Integer> integers = range.boxed().collect(Collectors.toList());
        Collections.shuffle(integers);      

        for(int i=0; i<Heap.length;i++)
        {
            Heap[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap.length; i++) 
            HeapCopy[i] = Heap[i];
        
        for(int i=0; i<Heap1.length;i++)
        {
            Heap1[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap1.length; i++) 
            HeapCopy1[i] = Heap1[i];        
        
        for(int i=0; i<Heap2.length;i++)
        {
            Heap2[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap2.length; i++) 
            HeapCopy2[i] = Heap2[i];        
        
        for(int i=0; i<Heap3.length;i++)
        {
            Heap3[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap3.length; i++) 
            HeapCopy3[i] = Heap3[i];   
        
        for(int i=0; i<Heap4.length;i++)
        {
            Heap4[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap4.length; i++) 
            HeapCopy4[i] = Heap4[i];   

        for(int i=0; i<Heap5.length;i++)
        {
            Heap5[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap5.length; i++) 
            HeapCopy5[i] = Heap5[i];        
    }
    
    private void restoreArrays()
    {
        for (int i=0; i<Heap.length; i++) 
            Heap[i] = HeapCopy[i];
        for (int i=0; i<Heap1.length; i++) 
            Heap1[i] = HeapCopy1[i];
        for (int i=0; i<Heap2.length; i++) 
            Heap2[i] = HeapCopy2[i];
        for (int i=0; i<Heap3.length; i++) 
            Heap3[i] = HeapCopy3[i];
        for (int i=0; i<Heap4.length; i++) 
            Heap4[i] = HeapCopy4[i];
        for (int i=0; i<Heap5.length; i++) 
            Heap5[i] = HeapCopy5[i];        
    }
    
    private void maxHeapify(int[] arr,int pos, int heapsize)
    { 
        
        int l = 2 * pos + 1;
        int r = 2 * pos + 2;
        int largest=pos;

        if (l < heapsize && arr[l] > arr[pos])
            largest = l;
        if (r < heapsize && arr[r] > arr[largest])
            largest = r;
        if (largest != pos)
        {
            int temp = arr[pos];
            arr[pos] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, heapsize);
        }
    } 
    
    private void buildMaxHeap(int[] arr)
    {
        for(int i = arr.length ; i>=0 ; i--)
        {
            maxHeapify(arr,i,arr.length);
        }
    }
    
    private void HeapSort(int[] arr)
    {
        long startTime = System.nanoTime();
        buildMaxHeap(arr);
        for(int i = arr.length - 1; i>=1;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,0,i);
        }
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }
    
    private void Mergesort(int[] arr,int beg, int end)  
    {  
        if (beg<end)  
        {  
            int mid = (beg+end)/2;  
            Mergesort(arr,beg, mid);  
            Mergesort(arr,mid+1, end);  
            merge(arr, beg, mid, end);  
        }  
    }
    private void merge(int[] arr, int beg, int mid, int end)  
    {  
        int l = mid - beg + 1;  
        int r = end - mid;  
  
        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  
  
        for (int i=0; i<l; ++i)  
            LeftArray[i] = arr[beg + i];  
  
        for (int j=0; j<r; ++j)  
            RightArray[j] = arr[mid + 1+ j];  
  
        int i = 0, j = 0;  
        int k = beg;  
        while (i<l&&j<r)  
        {  
            if (LeftArray[i] >= RightArray[j])  
            {  
                arr[k] = LeftArray[i];  
                i++;  
            }  
            else  
            {  
                arr[k] = RightArray[j];  
                j++;  
            }  
            k++;  
        }
        while (i<l)  
        {  
            arr[k] = LeftArray[i];  
            i++;  
            k++;  
        }  
        while (j<r)  
        {  
            arr[k] = RightArray[j];  
            j++;  
            k++;  
        }  
    }
    
    private void InsertionSort(int[] arr)
    {
        long startTime = System.nanoTime();        
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] < key) { 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }
    
    private void SelectionSort(int[] arr)
    {
        long startTime = System.nanoTime();        
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int max = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] > arr[max]) 
                    max = j; 
                    int temp = arr[i];
                    arr[i] = arr[max];
                    arr[max] = temp;
        }
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }
    
    private void BubbleSort(int[] arr)
    {
        long startTime = System.nanoTime();          
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) 
                { 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }     
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }
    
    public void Quicksort(int[] arr, int low, int high)
    { 
        if (low < high) 
        { 
            int pi = partition(arr,low, high); 
            Quicksort(arr,low, pi-1); 
            Quicksort(arr,pi+1, high); 
        } 
    }

    private int partition(int[] arr, int p, int r)
    {
        int x = arr[p]; 
        int i = p;
        int j = r;
        while (true) {

            while (arr[i] > x) {
                i++;
            }

            while (arr[j] < x) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                return j;
            }
        }    
    }
    
    public void Quicksortcast(int[] arr)
    {
        long startTime = System.nanoTime();
        Quicksort(arr,0,arr.length-1);
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }

    public void Mergesortcast(int[] arr)
    {
        long startTime = System.nanoTime();
        Mergesort(arr,0,arr.length-1);
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMilli = (long) (durationInNano / pow(10,3));
        System.out.println(durationInMilli);          
    }       
}