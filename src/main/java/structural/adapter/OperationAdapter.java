package structural.adapter;

//操作适配器：适配器

public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;//定义适配者QuickSort对象
    private BinarySearch searchObj;

    public OperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }


    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    public int search(int[] array, int key) {
        return searchObj.binarySearch(array,key);
    }
}
