class add{
    
    public void adding(int array[]){
        int result = 0;
        for(int n : array){
            result += n;
            System.out.println(result);
        }
    }
}

public class _14_anonymous_arrays {
    public static void main(String args[]){
        add obj = new add();
        obj.adding(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
