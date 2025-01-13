public class BetterArray{
    private int size = 0;
    public int[] array = new int[0];
    public BetterArray(){
        array = new int[0];
        size = 0;
    }
    public BetterArray(int length){
        array = new int[length];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(int item){
        if(array.length == 0){
            int[] array2 = new int[1];
            array = new int[array2.length];
            for(int i =0; i<array2.length; i++){
                array[i] = array2[i];
            }
        }
        if (size >= array.length){
            int[] array2 = new int[array.length*2]; 
            for(int i=0; i<array.length; i++){
                array2[i] = array[i];
            }
            array = new int[array2.length];
            for(int i=0; i<array2.length; i++){
                array[i] = array2[i];
            }
        }
        array[size] = item;
        size++;
        return true;
    }
    public void add(int index, int item){
        if(size >= array.length){
          int[] array2 = new int[array.length*2];
          for(int i=0; i<array.length; i++){
            array2[i] = array[i];
          }
          array = new int[array2.length];
          for(int i=0; i<array2.length; i++){
            array[i] = array2[i];
          }
        }
        int temp = array[index];
        for(int i=index+1; i<array.length; i++){
            int place = temp;
            temp = array[i];
            array[i] = place;
        }
        array[index] = item;
        size++;
    }
    public int get(int index){
        return array[index];
    }
    public int set(int index, int item){
        int old = 0;
        for(int i=0; i<array.length; i++){
            if(index == i){
                old = array[i];
                array[i] = item;
            }
        }
        return old;
    }
    public int remove(int index){
       int i = 0;
       int old = array[index];
       int[] array2 = new int[array.length-1];
       for(i = index; i<array.length-1; i++){
            array[i] = array[i+1];
       }
       size--;
        return old;
    }
}