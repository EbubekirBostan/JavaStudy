package j15_Arrays.odev;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int nums[]={14,19,5,21};
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("min = " + min);//min = 5



    }
}

