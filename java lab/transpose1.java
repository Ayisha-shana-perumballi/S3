import java.util.Scanner;
public class transpose1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows and columns");
int rows=sc.nextInt(); 
int cols=sc.nextInt();
int [][] matrix=new int[rows][cols];
System.out.print("enter the numbers into matrix");
for(int i =0;i<rows;i++)
{  
for(int j=0;j<cols;j++)
  {
   matrix[i][j]=sc.nextInt();
}
}
int [][]transpose=new int[cols][rows];
for (int i=0;i<rows;i++)
{
  for(int j=0;j<cols;j++)
  {
    transpose[j][i]=matrix[i][j];
  }
}
System.out.println("transpose matrix is:\n ");
for (int i=0;i<rows;i++)
{
  for(int j=0;j<cols;j++)
  {
    System.out.print(transpose[i][j]+" ");
  }
  System.out.println("\n");
}
}
}    
