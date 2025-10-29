package intermediate;


public class JaggedArrayExample {
    public static void main(String[] args) {
       
        int[][] jagged = new int[3][];
        jagged[0]=new int [2];
        jagged[1]=new int [3];
        jagged[2]=new int [4];

       int value=1;
        
        for (int i=0;i<jagged.length;i++){
            for (int j=0;j<jagged[i].length;j++){
                jagged[i][j]=value++;
            }
        }

        System.out.println("array element :");
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.println(jagged[i][j] +"\t");
            }
            System.out.println();
        }

        

    }
    
}
