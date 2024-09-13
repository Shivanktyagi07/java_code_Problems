package Arrays;


public class TransposeOf2D {
    public static void main(String[] args) {
        
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};
  
System.out.println("Elements of 2D matrix");
for(int i =0; i<3; i++){
    for(int j =0; j<3; j++){
        System.out.print(  matrix[i][j]+" ");
    }
    System.out.println();
}

System.out.println("Elements of 2D matrix after Transpose");

for(int i =0; i<3; i++){
    for(int j =0; j<3; j++){
        System.out.print(matrix[j][i]+" ");
    }
    System.out.println();
}
    }
}