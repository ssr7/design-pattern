package io.sr7.tutorial.behavioral.template_method;

public class TestTemplate {
    public static void main(String[] args) {
        BaseSort bubbleBaseSort =new BubbleSort();
        bubbleBaseSort.addNumber(10);
        bubbleBaseSort.addNumber(20);
        bubbleBaseSort.addNumber(5);
        bubbleBaseSort.addNumber(1);
        bubbleBaseSort.addNumber(100);
        bubbleBaseSort.sort();


        BaseSort quickSort =new QuickSort();
        quickSort.addNumber(10);
        quickSort.addNumber(20);
        quickSort.addNumber(5);
        quickSort.addNumber(1);
        quickSort.addNumber(100);
        quickSort.sort();
    }
}
