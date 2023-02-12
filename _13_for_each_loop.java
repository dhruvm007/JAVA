class prt_elements{

    void pe(){
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int result;
        int count = 0;
        for(int n : num){
            System.out.println("Element of index "+count+" is "+n);
            count++;
        }
    }

}

public class _13_for_each_loop {
    
    public static void main(String args[]){

        prt_elements obj = new prt_elements();
        obj.pe();
    }
}
