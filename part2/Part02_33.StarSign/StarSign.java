
public class StarSign {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public  static  void  printStars (int quantity){
        while (quantity> 0){
            System.out.print("*");
            quantity--;
        }
        System.out.println("");
    }
    public  static  void printSquare (int quan){
        int count = quan;
        while (count>0){
            printStars(quan);
            count--;
        }
    }
    public static void printRectangle (int width, int height){
        /*int count = height; */
        while (height > 0){
            printStars(width);
            height--;
        }
    }
    public static  void printTriangle (int size){
        int count = 0;
        while (count <= size){
            printStars(count);
            count++;
        }
    }
}
/*
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printStars(int number){
        for (int i = number; 0<i; i--){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare (int size){
        for (int i = size; 0< i; i--){
            printStars(size);
        }
    }
    public static void printRectangle (int width,int height){
        for (int i = height;  0 < i; i--){
            printStars(width);
        }
    }
    public static  void printTriangle (int size){
        int pass = 1;
        for (int i= size; 0< i; i--){
            printStars(pass);
            pass++;
        }
    }
}
*/
