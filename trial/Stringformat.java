import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*nput: Smartprix site india comparison best-Replacement array
{} is {4} online {3} shopping {} in {}-positional argument array
Output
Smartprix is best online comparison shopping site in India
Explanation-
**If there is number inside curly braces,print element of replacement array at that index, if that index exists otherwise print whatever is inside curly braces(Note-there may be word inside braces as well, in that case simply print that word)
**If there is nothing inside curly braces,number those as 0,1,2… from left to right and accordingly replace with corresponding element of replacement array
*/
public class Stringformat {

 

   
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String [] s = str.split(" ");
       int index = 0;
       boolean [] indexArr = new boolean[s.length];
       String form = sc.nextLine();
       String[] formatter = form.split(" ");
       for(String st:formatter){
           String i = st;
           if(i.equals("{}")){
               System.out.print(s[index]+" ");
               indexArr[index] = true;
               index++;
               while(index<s.length && indexArr[index]){
                   index++;
               }
           }
           else if(i.charAt(0)!='{'){
               System.out.print(i+ " ");
           }
           else{
               int numindex = Integer.parseInt(i.substring(1,i.length()-1));
               System.out.print(s[numindex]+" ");
               indexArr[numindex] = true;
               if(index==numindex){
                   while(index<s.length && indexArr[index]){
                   index++;
               }
               }
           }
           
       }
           
   }
}
