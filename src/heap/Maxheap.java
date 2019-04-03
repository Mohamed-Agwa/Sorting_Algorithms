
package heap;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maxheap
{
    private int[] Heap = new int[32];
    private int[] HeapCopy = new int[32];
    private int size; 
    private int maxsize=31;
    List<JLabel> LabelList = new ArrayList<JLabel>();
    Illustration ill = new Illustration(this);
    
    public Maxheap() 
    { 

    }
    
    private void importLabels()
    {
        LabelList = ill.sendLabels();
    }
    
    public void initialiseArray()
    {
        IntStream range = IntStream.rangeClosed(1, 99);
        List<Integer> integers = range.boxed().collect(Collectors.toList());
        Collections.shuffle(integers);
        Collections.shuffle(integers);
        Collections.shuffle(integers);
        for(int i=0; i<31;i++)
        {
            Heap[i] = Integer.parseInt(Integer.toString(integers.get(i)));
        }
        
        for (int i=0; i<Heap.length; i++) 
            HeapCopy[i] = Heap[i];
        
        for(int i=0;i<31;i++)
        {
            LabelList.get(i).setText(Integer.toString(Heap[i]));
        }
        
        ill.displayHeapContent(Heap);
        ill.writeLog("New Array generated!");   
    }
    
    public void restoreArray()
    {
        for(int i = 30; i>=0;i--)
        {
            LabelList.get(i).setForeground(Color.white);
        }
        
        for (int i=0; i<Heap.length; i++) 
            Heap[i] = HeapCopy[i];
        for(int i=0;i<31;i++)
        {
            LabelList.get(i).setText(Integer.toString(Heap[i]));
        }
        ill.displayHeapContent(Heap);  
        ill.writeLog("Array Restored!");
    }
    
    private int parent(int pos) 
    { 
        return pos / 2; 
    } 
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    }
    
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
    
    private void swap(int fpos, int spos) 
    { 
        System.out.println("Swap num1: " + Heap[fpos] + "\tnum2:" + Heap[spos]);
        int tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
        ill.writeLog("Swap num1: " + Heap[fpos] + "\t num 2: " + Heap[spos]);
    }
    
    private void swapLabels(int pos1, int pos2) throws InterruptedException
    {   
        Thread.sleep(1000);
        ill.update(ill.getGraphics());
        for(int i = 30; i>=0;i--)
        {
            LabelList.get(i).setForeground(Color.white);
        }
        
        ill.colorSwap(pos1, pos2, LabelList);
        String temp = LabelList.get(pos1).getText();
        LabelList.get(pos1).setText(LabelList.get(pos2).getText());
        LabelList.get(pos2).setText(temp);
        
    }
    
    public void updateHeap()
    {
        for(int i=0;i<31;i++)
        {
            LabelList.get(i).setText(Integer.toString(Heap[i]));
        }
    }
    
    private void maxHeapify(int pos, int heapsize) throws InterruptedException
    { 
        
        int l = leftChild(pos);
        int r = rightChild(pos);
        int largest=pos;

        if (l < heapsize && Heap[l] > Heap[pos])
            largest = l;
        if (r < heapsize && Heap[r] > Heap[largest])
            largest = r;
        if (largest != pos)
        {
            swap(pos,largest);
            swapLabels(pos,largest);
            maxHeapify(largest, heapsize);
        }
        ill.displayHeapContent(Heap);
    } 
    
    public void heapify() throws InterruptedException 
    {
        for(int i = 31/2 ; i>=0 ; i--)
        {
            maxHeapify(i,31);
        }
    }
    
    public void Heapsort() throws InterruptedException 
    { 
        ill.writeLog("\nHeap Sort!\n");
        System.out.println("Heap Sort!");
        for(int i = 30; i>=1;i--)
        {
            swap(0,i);
            swapLabels(0,i);
            maxHeapify(0,i);
        }
        reverse();
        updateHeap();
        ill.displayHeapContent(Heap);
        ill.update(ill.getGraphics());
    }
    
    private void merge(int beg, int mid, int end)  
    {  
        int l = mid - beg + 1;  
        int r = end - mid;  
  
        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  
  
        for (int i=0; i<l; ++i)  
            LeftArray[i] = Heap[beg + i];  
  
        for (int j=0; j<r; ++j)  
            RightArray[j] = Heap[mid + 1+ j];  
  
        int i = 0, j = 0;  
        int k = beg;  
        while (i<l&&j<r)  
        {  
            if (LeftArray[i] >= RightArray[j])  
            {  
                Heap[k] = LeftArray[i];  
                i++;  
            }  
            else  
            {  
                Heap[k] = RightArray[j];  
                j++;  
            }  
            k++;  
        }
        while (i<l)  
        {  
            Heap[k] = LeftArray[i];  
            i++;  
            k++;  
        }  
        while (j<r)  
        {  
            Heap[k] = RightArray[j];  
            j++;  
            k++;  
        }  
    }
  
    public void Mergesortcast()
    { 
        ill.writeLog("\nMerge Sort!\n");
        System.out.println("Merge Sort!");
        Mergesort(0,30);
        updateHeap();
        ill.displayHeapContent(Heap);
    }
    
    private void Mergesort(int beg, int end)  
    {  
        if (beg<end)  
        {  
            int mid = (beg+end)/2;  
            Mergesort(beg, mid);  
            Mergesort(mid+1, end);  
            merge(beg, mid, end);  
        }  
    }  
    
    private void reverse() 
    { 
        int[] arr = new int[31]; 
        int j = 31; 
        for (int i = 0; i < 31; i++) { 
            arr[j - 1] = Heap[i]; 
            j = j - 1; 
        }
        for(int i=0;i<31;i++)
        {
            Heap[i] = arr[i];
        }
    }     
    
    public void Insertionsort() throws InterruptedException
    { 
        ill.writeLog("\nInsertion Sort!\n");
        System.out.println("Insertion Sort!");
        int n = Heap.length; 
        for (int i = 1; i < n; ++i) { 
            int key = Heap[i]; 
            int j = i - 1; 
            while (j >= 0 && Heap[j] < key) { 
                swap(j+1,j);
                swapLabels(j+1,j);
                j = j - 1; 
            } 
            Heap[j + 1] = key; 
            updateHeap();
            ill.displayHeapContent(Heap);
        } 
    } 
    
    public void Selectionsort() throws InterruptedException 
    { 
        ill.writeLog("\nSelection Sort!\n");
        System.out.println("Selection Sort!");
        int n = Heap.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int max = i; 
            for (int j = i+1; j < n; j++) 
                if (Heap[j] > Heap[max]) 
                    max = j; 
                    swap(i,max);
                    swapLabels(i,max);
        }
        updateHeap();
        ill.displayHeapContent(Heap);
    }
    
    public void bubbleSort() throws InterruptedException 
    { 
        ill.writeLog("\nBubble Sort!\n");
        System.out.println("Bubble Sort!");
        int n = Heap.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (Heap[j] < Heap[j+1]) 
                { 
                    swap(j,j+1);
                    swapLabels(j,j+1);
                }
        updateHeap();
        ill.displayHeapContent(Heap);
    } 
  
    private int partition(int p, int r) throws InterruptedException {
        int x = Heap[p]; 
        int i = p;
        int j = r;
        while (true) {

            while (Heap[i] > x) {
                i++;
            }

            while (Heap[j] < x) {
                j--;
            }
            if (i < j) {
                swap(i,j);
                swapLabels(i,j);
            } else {
                return j;
        }
    }
}
    public void Quicksortcast() throws InterruptedException
    {
        ill.writeLog("\nQuick Sort!\n");
        System.out.println("Quick Sort!");
        Quicksort(0,30);
        updateHeap();
        ill.displayHeapContent(Heap);
    }
    public void Quicksort(int low, int high) throws InterruptedException 
    { 
        if (low < high) 
        { 
            int pi = partition(low, high); 
            Quicksort(low, pi-1); 
            Quicksort(pi+1, high); 
        } 
    }     
    
    public static void main(String[] args) {
        Maxheap heap = new Maxheap();
        heap.importLabels();
    }
}
