/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix_add;
import java.util.*;
class Matrix{
        int mat[][]=new int[50][50];
        int m,n;
     Matrix add_mat(Matrix a)
    {
       
        Matrix temp=new Matrix();
        temp.m=m;temp.n=n;
        int i,j;
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                temp.mat[i][j]=mat[i][j]+a.mat[i][j];
        return temp;
    }
    void input_mat()
    {
      Scanner s=new Scanner(System.in);
      int i,j;
      System.out.println("Enter order of matrix:");
      m=s.nextInt();
      n=s.nextInt();
      System.out.println("Enter matrix Elements:");
      for(i=0;i<m;i++)
          for(j=0;j<n;j++)
              mat[i][j]=s.nextInt();
    }
    void output_mat()
    {
      int i,j;
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
            System.out.print(mat[i][j]+"\t");
          System.out.println();
      }
    }

}
public class matrix_add {
    public static void main(String[] args) {
        Matrix A=new Matrix();
        Matrix B=new Matrix();
        Matrix C=new Matrix();
        System.out.println("Enter Matrix A:");
        A.input_mat();
        System.out.println("Enter Matrix B:");
        B.input_mat();
        System.out.println("Matrix A is:");
        A.output_mat();
        System.out.println("Matrix B is:");
        B.output_mat();
        if(A.m==B.m && A.n==B.n)
        {
            C=A.add_mat(B);
            System.out.println("Matrix A+B is:");
            C.output_mat();
        }
        else
            System.out.println("Matrix addition not possible because order of the marices not equal");
    }

}
