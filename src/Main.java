import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("-----------");
        System.out.println("What would you like to do"+"\n"+"1. Calculate cost of one package"+"\n"+"2. Simulate packages"+"\n"+"3. How package costs are calculated"+"\n"+"4. Exit");
        System.out.print("Input: ");
        int input=s.nextInt();
        if(input==1){
            System.out.println("-------------");
            System.out.print("Enter the zip code of the origin package: ");
            int zip=s.nextInt();
            System.out.print("Enter the zip code of the destination package: ");
            int zip2=s.nextInt();
            System.out.print("Enter the weight of the package: ");
            double weight=s.nextDouble();
            System.out.print("Enter the height of the package: ");
            double height=s.nextDouble();
            System.out.print("Enter the length of the package: ");
            double length=s.nextDouble();
            System.out.print("Enter the width of the package: ");
            double width=s.nextDouble();
            PostageCalculator old=new PostageCalculator();
            System.out.println("Cost: "+old.calculatePostage1(zip,zip2,weight,length,height,width));
        }else if(input==2){
            System.out.print(" ");
        } else if (input==3) {
            System.out.println("1.Base cost is 3.75"+"\n"+"2.Weight of package times 10 times .05"+"\n"+"3.first 3 zip code numbers\n3.Second zip code number\n3.Subtract the two and divide by 100\nExample:(73561-10206)/100(Only first three numbers)"+"\n"+"4.If combined size is 36 an additional 10 cents per inch"+"\n"+"5.40+ pound packages will charge 10 cents per pound over 40"+"\n"+"Shipping is calculated through all these steps");
        }else if(input==4){
            System.out.println("Exit");
        }
    }
}