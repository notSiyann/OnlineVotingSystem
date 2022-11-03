/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_na_final_voting;

/**
 *
 * @author Grey
 */
import java.util.*;
public class Final_na_Final_Voting {

    /**
     * @param args the command line arguments
      
     */static Scanner input = new Scanner(System.in);
     public static int age;
     public static String name, gender, address,id;
         public static String[] Design = {"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
        "*********************************************************************",
        "-------------------------------------------------------------------------"};
   
    static int count[] = new int[100];
    
    static int vote[] = new int[100];
   
    static String[] positions = {"President", "Vice President" , "Secretary", "Treasurer", "Auditor", "P.I.O."};
   
    static String[] position = new String[6];
    
    static String[][] candidates = {{"Clarence Camarillo","Johnrio Mar"}, 
        {"Saint Kaye Ebajay Cometa","May Antonette Pabro"}, 
        {"Mercy Joy Lastimosa Arcayena","Al Juliana Hermoso"}, 
        {"Marlon Kyell Sajelan", "Rycelle Coming Puruel"}, 
        {"Angelica Felix Alivio", "Ashley Ivory Tabaranza"}, 
        {"Christian Dave G. Cabiladas", "Sean Gerick Umlas"}};
    
    private static String Tpass,Tuser;       
   public static void main(String[] args) {
       {
           mainfunct();
       }
   }
    public static void mainfunct() {
       int attempt = 0;
       System.out.printf(Design[0]+"\n\t\tWelcome to our Voting System\n"+Design[0] +"\n");
       do{
        Tlogin();
        boolean log = login(Tuser,Tpass);
            if(log == true){
                System.out.println("\nSuccessfully login\n\n" + Design[1]);
                ++attempt;
                Process();
            }else
                System.out.println("Invalid Username or Password\n" + Design[1]);
            
      }while(attempt < 2);
       TieValidator();
       result();
    }
    
    private static boolean login(String user,String pass){
        return user.equals("admin") && pass.equals("12345");
    }
   
    private static boolean tielogin(String user,String pass){
        return user.equals("admin") && pass.equals("admin");
    }
    
    public static void Process(){
        System.out.print("To vote choose a number from the choices\n");
            prescounter();
            vicecounter();
            seccounter();
            trescounter();
            audicounter();
            piocounter();
        System.out.print(Design[2]+"\nYou successfully voted\n"+Design[2]+"\n");  
    } 
    
    public static void prescounter(){
         do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s\n1.%s\n2.%s\nThe number you choose is ",positions[0], candidates[0][0],candidates[0][1]);
            vote[0] = input.nextInt();
                switch(vote[0]){
                    case 1: position[0] = candidates[0][0];
                    count[0]++;
                    break;
                    case 2: position[0] =   candidates[0][1]  ;
                    count[1]++;
                    break;
                    default: position[0]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }
         }while(position[0].equals("Invalid Number"));      
            System.out.printf("You vote %s for the position of the %s\n",position[0],positions[0]);
    }
   
    public static void vicecounter(){
         do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s\n1.%s\n2.%s\nThe number you choose is ", positions[1],candidates[1][0],candidates[1][1]);
            vote[1] = input.nextInt();
                switch(vote[1]){
                    case 1: position[1] = candidates[1][0];
                    count[2]++;
                    break;
                    case 2: position[1] = candidates[1][1] ;
                    count[3]++;
                    break;
                    default: position[1]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }  
         }while(position[1].equals("Invalid Number")); 
            System.out.printf("You vote %s for the position of the %s\n",positions[1],positions[1]);
    }
   
    public static void seccounter(){
          do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s \n1.%s\n2.%s\nThe number you choose is ", positions[2],candidates[2][0],candidates[2][1]);
            vote[2] = input.nextInt();
                switch(vote[2]){
                    case 1: position[2] = candidates[2][0];
                    count[4]++;
                    break;
                    case 2: position[2] = candidates[2][1];
                    count[5]++;
                    break;
                    default: position[2]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }    
          }while(position[2].equals("Invalid Number"));
            System.out.printf("You vote %s for the position of the %s\n",position[2],positions[2]);
    }
    
    public static void trescounter(){
          do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s \n1.%s\n2.%s\nThe number you choose is ", positions[3],candidates[3][0],candidates[3][1]);
            vote[2] = input.nextInt();
                switch(vote[2]){
                    case 1: position[3] = candidates[3][0];
                    count[6]++;
                    break;
                    case 2: position[3] = candidates[3][1];
                    count[7]++;
                    break;
                    default: position[3]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }    
          }while(position[1].equals("Invalid Number"));
     
          System.out.printf("You vote %s for the position of the %s\n",position[3],positions[3]);
    }
    
    public static void audicounter(){
          do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s \n1.%s\n2.%s\nThe number you choose is ", positions[4],candidates[4][0],candidates[4][1]);
            vote[2] = input.nextInt();
                switch(vote[2]){
                    case 1: position[4] = candidates[4][0];
                    count[9]++;
                    break;
                    case 2: position[4] = candidates[4][1];
                    count[10]++;
                    break;
                    default: position[4]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }    
          }while(position[4].equals("Invalid Number"));
            System.out.printf("You vote %s for the position of the %s\n",position[4],positions[4]);
    }
    
    public static void piocounter(){
          do{
            System.out.printf( Design[1] + "\n\t\tCandidate for %s \n1.%s\n2.%s\nThe number you choose is ", positions[5],candidates[5][0],candidates[5][1]);
            vote[2] = input.nextInt();
                switch(vote[2]){
                    case 1: position[5] = candidates[5][0];
                    count[12]++;
                    break;
                    case 2: position[5] = candidates[5][1];
                    count[13]++;
                    break;
                    default: position[5]= "Invalid Number";
                    System.out.println("Invalid Number Please Try Again");
                    break;
                }    
          }while(position[5].equals("Invalid Number"));
            System.out.printf("You vote %s for the position of the %s\n",position[5],positions[5]);
    }
    public static void Tlogin(){
        System.out.println("\n=======================================\nF I L L  U P  T H E  F O L L O W I N G\n=======================================");
            System.out.println("");
        System.out.print("--------------------------------------\nInput Voter Registration: \n--------------------------------------\nID: ");
        id = input.next();
        System.out.print("Name: ");
        name = input.next();
        System.out.print("Gender: ");
        gender = input.next();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Address: ");
        address = input.next();
        System.out.println();
        System.out.print("\n~~~PLEASE ENTER USERNAME AND PASSWORD~~~\n\n");
       System.out.print("Enter Username: ");
       Tuser = input.next();
       System.out.print("Enter Password: ");
       Tpass = input.next();
    }
    
    public static void TieValidator(){
        int validator = 0;
        if(count[0]==count[1] && count[2] == count[3] && count[4] == count[5]){
            do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s, %s and %s!\n" 
                        + Design[1] +"\n", positions[0], positions[1], positions[2]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        prescounter();
                        vicecounter();
                        seccounter();
                        trescounter();
                        audicounter();
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
        }else if(count[0] == count[1] && count[2] == count[3] && count[4] != count[5]){
           do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s and %s!\n" 
                        + Design[1]+"\n",positions[0], positions[1]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        prescounter();
                        vicecounter();
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }else if(count[0] != count[1] && count[2] == count[3] && count[4] == count[5]){
            do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s and %s!\n" + Design[1]+"\n",positions[1],positions[2]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        vicecounter();
                        seccounter();
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }else if(count[0] == count[1] && count[2] != count[3] && count[4] == count[5]){
           do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s and %s!\n" + Design[1]+"\n",positions[0],position[2]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        prescounter();
                        seccounter();
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }else if(count[0] == count[1] && count[2] != count[3] && count[4] != count[5]){
           do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s!\n" + Design[1]+"\n",positions[0]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        prescounter();
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }else if(count[0] != count[1] && count[2] == count[3] && count[4] != count[5]){
            do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s!\n" + Design[1]+"\n",positions[1]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        vicecounter();                       
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }else if(count[0] != count[1] && count[2] != count[3] && count[4] == count[5]){
           do{
                System.out.printf(Design[1] + "\n There is a tie in the position for the %s!\n" + Design[1]+"\n",positions[2]);
                Tlogin();
                boolean plog = tielogin(Tuser,Tpass);
                    if(plog == true){
                        ++validator;
                        System.out.println("Successfully login");
                        seccounter();                       
                    }else
                        System.out.println("Invalid Username or Password");
            }while(validator < 1);
       }
    }
    
    public static void result(){
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s \n%s = " + count[0] +"\n%s = " 
                + count[1] + "\n"+Design[2] ,positions[0],candidates[0][0],candidates[0][1]);
            if(count[0] > count[1])
                System.out.printf("\n%s won the position for the %s\n",candidates[0][0],positions[0]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[0][1],positions[0]);
            
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s\n%s = " + count[2] +"\n%s = " 
                + count[3] + "\n"+Design[2],positions[1],candidates[1][0],candidates[1][1]);
            if(count[2] > count[3])
                System.out.printf("\n%s won the position for the %s\n",candidates[1][0],positions[1]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[1][1],positions[1]);
            
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s\n%s = " + count[4] + "\n%s = " 
                + count[5] + "\n"+Design[2],positions[2],candidates[2][0],candidates[2][1]);
            if(count[4] > count[5])
                System.out.printf("\n%s won the position for the %s\n",candidates[2][0],positions[2]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[2][1],positions[2]);
        
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s\n%s = " + count[6] + "\n%s = " 
                + count[7] + "\n"+Design[2],positions[3],candidates[3][0],candidates[3][1]);
            if(count[4] > count[5])
                System.out.printf("\n%s won the position for the %s\n",candidates[3][0],positions[3]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[3][1],positions[3]);
            
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s\n%s = " + count[4] + "\n%s = " 
                + count[5] + "\n"+Design[2],positions[4],candidates[4][0],candidates[4][1]);
            if(count[4] > count[5])
                System.out.printf("\n%s won the position for the %s\n",candidates[4][0],positions[4]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[4][1],positions[4]);
            
        System.out.printf(Design[2]+"\n\t\tVoting Result for the %s\n%s = " + count[6] + "\n%s = " 
                + count[7] + "\n"+Design[2],positions[5],candidates[5][0],candidates[5][1]);
            if(count[4] > count[5])
                System.out.printf("\n%s won the position for the %s\n",candidates[5][0],positions[5]);
            else
                System.out.printf("\n%s won the position for the %s\n",candidates[5][1],positions[5]);    
    
    }
    
}
