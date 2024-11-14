public class Main {
    public static void main(String[] args) {
        int[][] result = new int[5][5];
        for(int j = 0 ; j < 5 ; j++ ){
                result[0][j] = 1;
            }
        for(int j = 0 ; j < 5 ; j++ ){
                result[j][0] = 1;
            }   
        for(int i = 1 ; i < 5 ; i++ ){
            for(int j = 1 ; j < 5 ; j++ ){
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        for(int i = 0 ; i < 5 ; i++ ){
            for(int j = 0 ; j < 5 ; j++ ){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}