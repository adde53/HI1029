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
    /*public static void addQueen(int rad,int n){
        
        //nwDiagonal(rad+kolumn,n,kolumn);
        //array[2][1]=true;
        /*array[rad][kolumn]=true;
        column[rad]=true;
        neDiagonal[rad+kolumn]=true;
        nwDiagonal[((rad-kolumn)+7)]=true;
        System.out.println("kOLUMN: "+kolumn);
        for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        System.out.print(" "+array[i][j]);
                    }
                    System.out.println();
        }
        System.out.println();
        neDiagonal(rad+kolumn,n,kolumn);
        //System.out.print(" "+neDiagonal[2]);
        for(int j = 1;j<=rad;j++){
                System.out.print(", K: "+column[j]);
        }
        System.out.println();
        for(int j = 1;j<=rad+kolumn;j++){
                System.out.print(", NE: "+neDiagonal[j]);
        }
        System.out.println();
        for(int j = 1;j<=((rad-kolumn)+7);j++){
                System.out.print(", NW: "+nwDiagonal[j]);
        }*/
       // System.out.print(", NW: "+n);
        /*int kolumn=1;
        kolumn = column(rad,n, kolumn);
         //System.out.println("RADADDADDA " + column[rad]);
        if((!column[kolumn])){// && !column[kolumn])){//&& !nwDiagonal[((rad-kolumn)+7)]
           //System.out.println("RADADDADDA " + column[rad]);
            array[rad][kolumn]=true;
            column[kolumn]=true;
            neDiagonal[rad+kolumn]=true;
            nwDiagonal[((rad-kolumn)+(n-1))]=true;
            if(rad == n){
                for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        if(array[i][j]==true)
                            System.out.print(" 1 ");
                        if(array[i][j]==false)
                            System.out.print(" 0 ");
                    }
                    System.out.println();
                }
            }
            
            else{
                for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        if(array[i][j]==true)
                            System.out.print(" 1 ");
                        if(array[i][j]==false)
                            System.out.print(" 0 ");
                    }
                    System.out.println();
                }
                System.out.println("Tja");
                //addQueen(rad+1,n);//+1
                addQueen(rad+1,n);//+1
                System.out.println("Hej");
                array[rad][kolumn]=false;
                column[kolumn]=false;
                neDiagonal[rad+kolumn]=false;
                nwDiagonal[((rad-kolumn)+(n-1))]=false;
            }
            
           
           // System.out.println();
            /*for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        if(array[i][j]==true)
                            System.out.print(" 1 ");
                        if(array[i][j]==false)
                            System.out.print(" 0 ");
                    }
                    System.out.println();
                }*/
            //System.out.println(" " + array[rad][kolumn] + " "+column[rad] + " "+neDiagonal[rad+kolumn] + " " + nwDiagonal[((rad-kolumn)+7)]);

        //}
    //}
    /*public static int column(int rad,int n, int kolumn){
        for(int i = 1; i <= n; i++){
            //System.out.println("RADADDADDA " + column[i]);
                if(column[i]==false && !nwDiagonal[((rad-i)+(n-1))] && !neDiagonal[rad+i]){
                   System.out.println("Kolumn: " + i +" Rad: " + rad);
                     //column[rad]=true;
                     return i;
                }
        }
        System.out.println("Kolumn: " + kolumn +" Rad: " + rad);
        return kolumn;
    }*/
    /*
    public static boolean[] neDiagonal(int rad,int n, int kolumn){
        int temp = rad;//4
        
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n;j++){
                if(array[i][j]==true){
                    if(j+i==temp){
                        System.out.println("HEASD " + i);
                        neDiagonal[temp]=true;
                        //System.out.println(temp);
                    }
                }
                if(array[i][j]==false){
                    if(j+i==temp){
                        neDiagonal[temp]=false;
                    }
                }
            }
        }
        return neDiagonal;
    }
    public static boolean nwDiagonal(int rad,int n, int kolumn){
        int temp = rad;
        if(nwDiagonal[temp] == true){
        for(int i = 1; i <= n ; i++){
            for(int j=1;j<= n ; j++){
                if(nwDiagonal[i+j]==true){
                    System.out.println(" " +(i+j));
                        if(((i-j)+(n-1))==temp){
                            System.out.println("HEASD " + i);
                            return true;
                       
                    }
                }
            }
        }
    }
        return false;
    }*/
}

/*
 public static void addQueen(int rad, int n,int kolumn){
        //System.out.println("Position: " + position);
        /*array[rad][kolumn]=true;
        for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        System.out.print(" "+array[i][j]);
                    }
                    System.out.println();
        }
        System.out.println();
        neDiagonal(rad+kolumn,n,kolumn);
        //System.out.print(" "+neDiagonal[2]);
        for(int j = 1;j<=rad+kolumn;j++){
                System.out.print(" "+neDiagonal[j]);
        }
        /*for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        if(i+j==rad){
                            System.out.print("TJA ");
                        }else
                            System.out.print("HEJ ");
                        
                    }
                    System.out.println();
        }*/
        /*neDiagonal(rad,n,kolumn);
        nwDiagonal(rad,n,kolumn);
        column(rad,n,kolumn);*/
        /*if(!column[rad] && !neDiagonal[rad+kolumn] && !nwDiagonal[rad+kolumn]){// && neDiagonal(rad,n,kolumn)){//&& nwDiagonal(rad,n,kolumn)){// && ((rad+kolumn)!=(rad+1)) && (((rad-kolumn)+(n-1))!=(rad+1))){
           //System.out.println(""+column[rad]);
            array[rad][kolumn]=true;
            column[rad]=true;
            System.out.println(""+rad);
            //column(rad,n,kolumn);
            //System.out.println("HEASD");
            neDiagonal[rad+kolumn] = true;
            
            neDiagonal(rad+kolumn,n,kolumn);
            
            nwDiagonal[rad+kolumn] = true;
            nwDiagonal(rad+kolumn,n,kolumn);
            if(rad == n){
                for(int i = 1; i<=n;i++){
                    for(int j = 1;j<=n;j++){
                        System.out.print(" "+array[i][j]);
                    }
                    System.out.println();
                }
            }
            else{
                //System.out.println("HEASD");
                addQueen(rad+1,n,kolumn);//+1
            }
            //System.out.println();
            array[rad][kolumn]=false;
            column[rad]=false;
            //column(rad,n,kolumn);
            
            neDiagonal[rad+kolumn] = false;
            neDiagonal(rad+kolumn,n,kolumn);
            
            nwDiagonal[rad+kolumn] = false;
            nwDiagonal(rad+kolumn,n,kolumn);
        }
        //column(rad,n,kolumn);
    }
    
    /*public static boolean[] column(int rad,int n, int kolumn){
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n;j++){
                if(array[i][j]==true){
                    System.out.println("HEASD");
                     column[rad]=true;
                }
                /*if(array[j][i]==false){
                     column[i]=false;
                }
            }
        }
        return column;
    }*/
    /*public static boolean[] neDiagonal(int rad,int n, int kolumn){
        int temp = rad;
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n;j++){
                if(array[i][j]==true){
                    if(j+i==temp){
                        neDiagonal[temp]=true;
                    }
                }
                if(array[i][j]==false){
                    if(j+i==temp){
                        neDiagonal[temp]=false;
                    }
               
                }
            }
        }
        return neDiagonal;
    }
    public static boolean[] nwDiagonal(int rad,int n, int kolumn){
        int temp = rad;
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=n;j++){
                if(array[i][j]==true){
                        if(((i-j)+(n-1))==temp){
                        nwDiagonal[temp]=true;
                    }
                }
                if(array[i][j]==false){
                        if(((i-j)+(n-1))==temp){
                        nwDiagonal[temp]=false;
                    }

                }
            }
        }
        return nwDiagonal;
    }
*/
