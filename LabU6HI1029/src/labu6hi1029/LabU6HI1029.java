/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labu6hi1029;

/**
 *
 * @author adde_
 */
public class LabU6HI1029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addQueen(1,4);
        System.out.println("Antal sätt att lösa detta: " + count);
    }
    public static boolean[][] array = new boolean[9][9];
    public static boolean[] column = new boolean[9];
    public static boolean[] neDiagonal= new boolean[17];
    public static boolean[] nwDiagonal= new boolean[17];
    private static int count=0;
    public static void addQueen(int rad,int n){
        for(int i = 1; i <= n; i++){
            if(column[i]==false && !nwDiagonal[((rad-i)+(n-1))] && !neDiagonal[rad+i]){
                array[rad][i]=true;
                column[i]=true;
                neDiagonal[rad+i]=true;
                nwDiagonal[((rad-i)+(n-1))]=true;
                if(rad==n){
                    for(int s = 1; s<=n;s++){
                        for(int j = 1;j<=n;j++){
                            if(array[s][j]==true)
                                System.out.print(" 1 ");
                            if(array[s][j]==false)
                                System.out.print(" 0 ");
                        }
                        System.out.println();
                    }
                    count++;
                    System.out.println();
                }
                else{
                    addQueen(rad+1,n);
                }
                array[rad][i]=false;
                column[i]=false;
                neDiagonal[rad+i]=false;
                nwDiagonal[((rad-i)+(n-1))]=false;
            }
        }
    }
}