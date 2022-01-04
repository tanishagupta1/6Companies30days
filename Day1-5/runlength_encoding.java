import java.util.Scanner;

public class runlength_encoding {
    static String encode(String s)
	{
          //Your code here
          String ans="";
       	int i=0;
	 while(i<s.length()){
              String ch=Character.toString(s.charAt(i));
              int count=1;
              int j=i+1;
              while( j<s.length() && s.charAt(i)==s.charAt(j)){
                  count++;
                  j++;
              }
              i=j;
              ans=ans+ch+count;
          }
          return ans;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=encode(s);
        System.out.println(ans);
        sc.close();
    }
	
}
