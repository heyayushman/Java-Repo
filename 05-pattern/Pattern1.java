public class Pattern1 {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){
            String row = "";
            for(int j = 0; j <= i; j++){
                row += " * ";
            }
            System.out.println(row);
        }
    }
}

//? Output
/** 
 *  * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  *  * 
 *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
*/

// public class Pattern1 {
//     public static void main(String[] args){
//         for(int i = 10; i >= 0; i--){
//             String row = "";
//             for(int j = 10; j >= i; j--){
//                 row += " * ";
//             }
//             System.out.println(row);
//         }
//     }
// }