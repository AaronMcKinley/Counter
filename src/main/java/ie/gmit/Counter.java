package ie.gmit;

public class Counter {
    public int count;

    public Counter(){
        count=0;
    }
    public Counter(int aCount){
        if(aCount>0) {
            count = aCount;
        }
        else{
            throw new IllegalArgumentException("Less than 0");
        }
    }
    public int getCount() {
        return count;
    }
    public int incrementCount(){
        ++count;
        return count;
    }
    public int decrementCount(){
        --count;
        return count;
    }
}
