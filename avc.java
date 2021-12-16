class avc { 
    //1st PART
    public static void printSum(int n) { 
        int sum = 0;  
        for(int i=1; i<=n; i++) { 
            sum += i; 
        }
        System.out.println("Sum : "+sum); 
    }
    //2nd PART
    public static void printSum( int a, int b ) { 
        int sum = 0; 
        for(int i=a; i<=b; i++) { 
            sum += i; 
        } 
        System.out.println("Sum : "+sum); 
    }
    
    //3RD PART 
    public static void printSum( ) {
        double sum=0;
        for(int i=10; i<=20;i+=1) { 
            sum += i;
        }
        sum /= 10;
        System.out.println("Sum : "+sum);
    }
} 