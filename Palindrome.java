import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Palindrome{
	boolean IsPalindrome(String s)
	{
		int l=s.length();
		String rev="";
		for(int i=l-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws IOException {
                     System.out.println("-----------  A.POOJA --------------");
		Palindrome p=new Palindrome();
		try( FileReader fr=new FileReader("C:\\Users\\Pooja\\OneDrive\\Desktop\\javalab2\\in.txt");
		BufferedReader br=new BufferedReader(fr);FileWriter fw=new FileWriter("C:\\Users\\Pooja\\OneDrive\\Desktop\\javalab2\\out.txt");
		BufferedWriter bw=new BufferedWriter(fw))
		{
		int count=0;
		String s;
		while((s=br.readLine())!=null)
		{
			s=s.toUpperCase();	
        StringTokenizer str = new StringTokenizer(s,". ");
        int w=str.countTokens(); 
        String word[]=new String[w];
        for(int i=0;i<w;i++)
        {
            word[i]=str.nextToken();
        }
        System.out.print("OUTPUT : \n The palindromes found are:\n");
        for(int i=0; i<w; i++)
        {
            if(p.IsPalindrome(word[i])==true)
            {
                count++;
                System.out.print(word[i]+"\t");
				//bw.write(word[i]+"\t");
            }
        }
        bw.write("The count of palindromes is "+count);
		   }
		  System.out.println(" " +"\n"+ "The count of palindromes is "+count);
		bw.close();
		br.close();
		fr.close();
		fw.close();
		throw new IllegalFileFormatException("An Exception is thrown if there");
		}
		catch(IllegalFileFormatException e)
		{
			System.out.println("IllegalFileFormatException" +e.getMessage());
		}
		finally{
			System.out.println("The output is written in out.txt file successfully");
		}
	}
}
