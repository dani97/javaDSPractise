package expanion1;

import java.util.Scanner;

public class ValidShuffle {
	public Integer i = 0,j=0;
	public void check(String a,String b,String c){
		int k=0;
		while(k<c.length()){
			if(!find(a,b,c.charAt(k))){
				break;
			}

			k++;
		}
		if(k==c.length())
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		sc.close();
		new ValidShuffle().check(a, b, c);
	}

	private  boolean find(String a, String b, char c) {
		int I = this.i;
		int J = this.j;
		// TODO Auto-generated method stub
		//System.out.println(J);
		while(I<a.length()||J<b.length()){
			if(I<a.length()){
				if(a.charAt(I)==c){
					System.out.println(I+"  a"+a.charAt(I));
					this.i = I+1;
					System.out.println(this.i);
					return true;
				}
			}
			if(J<b.length()){
				if(b.charAt(J)==c){
					System.out.println(J+" b "+b.charAt(J));
					this.j = J+1;
					System.out.println(this.j);
					return true;
				}
			}
			I++;
			J++;
		}
		return false;
	}

}
