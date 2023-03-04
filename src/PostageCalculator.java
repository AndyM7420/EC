public class PostageCalculator {
    public  double calculatePostage1(int zip1, int zip2,double weight,double length, double height, double width) {
        String first3=Integer.toString(zip1);
        double extraWeight=0.00;
        String sec3=Integer.toString(zip2);
        double shipping = 3.75;
        double packageSize = length+ height +width;
        double countyCode=(Integer.parseInt(first3.substring(0,3))-Integer.parseInt(sec3.substring(0,3)))/100.00;
        shipping=shipping+countyCode+((weight*10)*.05);
        if(weight>40){
            extraWeight=weight-40;
            shipping+=((extraWeight*10)*.10);

        }
        if(packageSize>36){
            shipping+=(.10*packageSize);
        }
    return shipping;
    }
    public static double calculatePostage2(Address first, Address sec, double weight, double length, double height, double width){
        String first3=Integer.toString(first.getZip());
        double extraWeight;
        String sec3=Integer.toString(sec.getZip());
        double packageSize = length+ height +width;
        double countyCode=(Integer.parseInt(first3.substring(0,3))-Integer.parseInt(sec3.substring(0,3)))/100.00;
        double shipping = 3.75;
        shipping=shipping+countyCode+((weight*10)*.05);
        if(weight>40){
            extraWeight=weight-40;
            shipping+=((extraWeight*10)*.10);

        }
        if(packageSize>36){
            shipping+=(.10*packageSize);
        }
        return shipping;
    }
    public static double calculatePostage3(Package own){
        String first3=Integer.toString(own.getOrigin().getZip());
        String sec3=Integer.toString(own.getDestination().getZip());
        double extraWeight;
        double countyCode=((Integer.parseInt(first3.substring(0,3))-Integer.parseInt(sec3.substring(0,3)))/100.00);
        double packageSize=own.getLength()+own.getHeight()+own.getWidth();
        double shipping=3.75;
        shipping=shipping+countyCode+((own.getWeight()*10)*.05);
        if(own.getWeight()>40){
            extraWeight=own.getWeight()-40;
            shipping+=((extraWeight*10)*.10);
        }
        if(packageSize>36){
            shipping+=(.10*packageSize);
        }
        return shipping;
    }
}
