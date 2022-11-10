public class App {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' }, //0
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' }, //1
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' }, //2
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' }, //3
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' }, //4
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' }, //5
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' }, //6 
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' }, //7
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' }, //8
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' }, //9
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' }, //10
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' }, //11
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' }, //12
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' }, //13
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }  //14
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");
        for (int i = 0; i < 14; i++) {
        for (int j = 0; j <= 8; j++) 
        if (i == 2) 
        System.out.print(array[i][j] + " ");
      }    
       
    
       

        // // =============================================================
        // // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");
        System.out.println(" ");
        for (int i = 0; i < 14; i++) {
        for (int j = 2; j <= 12; j++) 
        if (i == 13) 
        System.out.print(array[i][j] + " ");
    }    
    
      
        
      

        // // =============================================================
        // // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");
        System.out.println(" ");
        for (int i = 2; i <= 9; i++) {
        for (int j = 0; j <= 14; j++) 
        if (j == 9) 
        System.out.println(array[i][j] + " ");
      }    
      
        


        // // =============================================================
        // // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");
        for (int row4 = 0; row4 < array.length; row4++) {
        System.out.println();
        for (int column4 = 0; column4 < array.length; column4++) {
        if (row4 == 7 && column4 == 0 || row4 == 8 && column4 == 1 || row4 == 9 && column4 == 2 || row4 == 10 && column4 == 3 || row4 == 11 && column4 == 4 || row4 == 12 && column4 == 5) {
        System.out.print(array[row4][column4] + " ");
        } else {
        System.out.print(" ");
                }
            }
        }
        
        // // =============================================================
        // // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");
        for (int row4 = 0; row4 < array.length; row4++) {
        System.out.println();
        for (int column4 = 0; column4 < array.length; column4++) {
        if (row4 == 12 && column4 == 0 || row4 == 11 && column4 == 1 || row4 == 10 && column4 == 2 || row4 == 9 && column4 == 3 || row4 == 8 && column4 == 4 || row4 == 7 && column4 == 5|| row4 == 6 && column4 == 6 || row4 == 5 && column4 == 7 ) {
        System.out.print(array[row4][column4] + " ");
        } else {
        System.out.print(" ");
                }
            }
        }
      
        // // =============================================================
        // // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");
        System.out.println(" ");
        for (int i = 0; i < 14; i++) {
        for (int j = 4; j <= 10; j++) 
        if (i == 1) 
        System.out.print(array[i][j] + "  ");
      }    
    

        // // =============================================================
        // // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");
        System.out.println(" ");
        for (int i = 1; i <= 11; i++) {
        for (int j = 0; j <= 14; j++) 
        if (j == 14) 
        System.out.println(array[i][j] + " ");
      }    
    


        // // =============================================================
        // // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");
               for (int row4 = 0; row4 < array.length; row4++) {
        System.out.println();
        for (int column4 = 0; column4 < array.length; column4++) {
        if (row4 == 0 && column4 == 14 || row4 == 1 && column4 == 13 || row4 == 2 && column4 == 12 || row4 == 3 && column4 == 11 || row4 == 4 && column4 == 10 || row4 == 5 && column4 == 9|| row4 == 6 && column4 == 8 || row4 == 7 && column4 == 7|| row4 == 8 && column4 == 6 ) {
        System.out.print(array[row4][column4] + " ");
        } else {
        System.out.print(" ");
                }
            }
        }

        // // =============================================================
        // // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");
        for (int row4 = 0; row4 < array.length; row4++) {
        System.out.println();
        for (int column4 = 0; column4 < array.length; column4++) {
        if (row4 == 4 && column4 == 0 || row4 == 3 && column4 == 1 || row4 == 2 && column4 == 2 || row4 == 1 && column4 == 3 || row4 == 0 && column4 == 4) {
        System.out.print(array[row4][column4] + " ");
        } else {
        System.out.print(" ");
                }
            }
        }
        
        // // =============================================================
        // // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");
        for (int row4 = 0; row4 < array.length; row4++) {
        System.out.println();
        for (int column4 = 0; column4 < array.length; column4++) {
        if (row4 == 3 && column4 == 6 || row4 == 4 && column4 == 7 || row4 == 5 && column4 == 8 || row4 == 6 && column4 == 9 || row4 == 7 && column4 == 10 || row4 == 8 && column4 == 11) {
        System.out.print(array[row4][column4] + " ");
        } else {
        System.out.print(" ");
                }
            }
        }
