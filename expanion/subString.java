package expanion;

import java.util.Scanner;

public class subString {
	public static boolean StringContainsExpanion(String s)
	{

        // write your code here
        String check = "expanion";
        int l=0;
        for(int i=0;i<s.length();i++){
            if(check.charAt(l)==s.charAt(i))
                l++;
            if(l==8)
                break;
        }
        if(l>=8)
            return true;
        else
            
        return false; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(StringContainsExpanion(str));
	}

}
