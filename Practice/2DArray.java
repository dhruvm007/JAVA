public interface _12_2d_array {
    public static void main(String args[]){

        int num[][] = {
            {1,2,7,8}, {3,4}, {5,6}
        };

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
