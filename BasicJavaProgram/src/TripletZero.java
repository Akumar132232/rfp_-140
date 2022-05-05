import java.util.*;
class TripletZero{
    public static void main(String[] args) {
        int l=0;
        int n;
        int arr[];
        System.out.println("Enter Array length");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner num = new Scanner(System.in);
            arr[i] = num.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                for(int z=j+1;z<arr.length;z++){
                    if(arr[i]+arr[j]+arr[z]==0){
                        l++;

                    }


                }

            }


        }
        System.out.println(l+" pair");
    }
}