import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a player between 'x' or 'o' ");
        char p=sc.next().charAt(0);     // x or o  player

        char a[][]=new char[3][3];
        char c='1';

            //Initialize the game tray

        for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               a[i][j]=c;
               c++;
           }
        }


        char ch;
        int count=0,t=0;
        int x=0,o=0;
        do{
            for (int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");}
                System.out.println();
            } System.out.println();            // Displaying the tray for Game


            System.out.println("Enter a postion for Player - "+p);
            int pos=sc.nextInt();
            switch (pos){

                case 1: if(a[0][0]=='x' || a[0][0]=='o') {
                    System.out.println("Space already reserved");
                    count=1;}
                        else {   a[0][0] = p;  count=0; t++;}
                    break;

                case 2: if(a[0][1]=='x' || a[0][1]=='o'){
                            System.out.println("Space already reserved");
                            count=1; }
                        else { a[0][1] = p;  count=0; t++;}
                    break;

                case 3: if(a[0][2]=='x' || a[0][2]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                    else { a[0][2] = p;  count=0; t++; }
                    break;

                case 4: if(a[1][0]=='x' || a[1][0]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[1][0] = p;  count=0; t++; }
                    break;

                case 5: if(a[1][1]=='x' || a[1][1]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[1][1] = p;  count=0;  t++;}
                    break;

                case 6: if(a[1][2]=='x' || a[1][2]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[1][2] = p;  count=0;  t++;}
                    break;

                case 7: if(a[2][0]=='x' || a[2][0]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[2][0] = p;  count=0; t++; }
                    break;

                case 8: if(a[2][1]=='x' || a[2][1]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[2][1] = p;  count=0; t++; }
                    break;

                case 9: if(a[2][2]=='x' || a[2][2]=='o'){
                    System.out.println("Space already reserved");
                    count=1;}
                else { a[2][2] = p;  count=0; t++; }
                    break;

            }
                    // Winner for x
                    if(a[0][0]=='x' && a[1][1]=='x' && a[2][2]=='x'){System.out.println("Winner is - "+p);
                        break; }

                    else if(a[0][2]=='x' && a[1][1]=='x' && a[2][0]=='x'){System.out.println("Winner is - "+p);
                        break;}

                    else if(a[0][0]=='x' && a[1][0]=='x' && a[2][0]=='x'){System.out.println("Winner is - "+p);
                        break;}

                    else if(a[0][1]=='x' && a[1][1]=='x' && a[2][1]=='x'){System.out.println("Winner is - "+p);
                        break; }

                    else if(a[0][2]=='x' && a[1][2]=='x' && a[2][2]=='x'){ System.out.println("Winner is - "+p);
                        break; }

                    else if(a[0][0]=='x' && a[0][1]=='x' && a[0][2]=='x'){System.out.println("Winner is - "+p);
                        break;}

                    else if(a[1][0]=='x' && a[1][1]=='x' && a[1][2]=='x'){System.out.println("Winner is - "+p);
                        break;}

                    else if(a[2][0]=='x' && a[2][1]=='x' && a[2][2]=='x'){System.out.println("Winner is - "+p);
                        break;}

                    // winner for o

            if(a[0][0]=='o' && a[1][1]=='o' && a[2][2]=='o'){System.out.println("Winner is - "+p);
                break; }

            else if(a[0][2]=='o' && a[1][1]=='o' && a[2][0]=='o'){System.out.println("Winner is - "+p);
                break;}

            else if(a[0][0]=='o' && a[1][0]=='o' && a[2][0]=='o'){System.out.println("Winner is - "+p);
                break;}

            else if(a[0][1]=='o' && a[1][1]=='o' && a[2][1]=='o'){System.out.println("Winner is - "+p);
                break; }

            else if(a[0][2]=='o' && a[1][2]=='o' && a[2][2]=='o'){ System.out.println("Winner is - "+p);
                break; }

            else if(a[0][0]=='o' && a[0][1]=='o' && a[0][2]=='o'){System.out.println("Winner is - "+p);
                break;}

            else if(a[1][0]=='o' && a[1][1]=='o' && a[1][2]=='o'){System.out.println("Winner is - "+p);
                break;}

            else if(a[2][0]=='o' && a[2][1]=='o' && a[2][2]=='o'){System.out.println("Winner is - "+p);
                break;}


            if(t==9){
                System.out.println("Game Over");
                break;
                }

                // condition for swap user
            if(p=='x' && count==0){
                p='o';
            }
            else if(p=='o' && count==0) {
                p='x';
            }
            System.out.println("Do you want to continue ? ");
            ch=sc.next().charAt(0);

        }while (ch=='y');

    }

}
