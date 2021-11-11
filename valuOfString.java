public class valuOfString {
    public static void main(String args[]){
        boolean bool = true;
        char car = 'J';
        int ant = 25;
        double dool = 225.225;
        float foot = 343f;
        long lungi = 07751;
        char arru[] = {'J', 'A', 'I', 'D', 'E', 'E', 'P'};

        //booli
        System.out.println("Booli val : "+String.valueOf(bool));

        //car
        System.out.println("Car val : "+String.valueOf(car));

        //ant
        System.out.println("Ant val : "+String.valueOf(ant));

        //dool
        System.out.println("Dool val : "+String.valueOf(dool));

        //foot
        System.out.println("Foot val : "+String.valueOf(foot));

        //longi
        System.out.println("Longi val : "+String.valueOf(lungi));

        //arru[]
        System.out.println("Arra val : "+String.valueOf(arru, 3, 4).toLowerCase());
    }
}
