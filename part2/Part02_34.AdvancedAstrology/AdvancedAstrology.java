
public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(4);

    }

    public static void printStars(int quantity) {
        while (quantity > 0) {
            System.out.print("*");
            quantity--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        int stars = 1;
        while (stars <= size){
            printSpaces(spaces);
            printStars(stars);
            stars++;
            spaces--;
        }
    }
    public static void  christmasTree (int height) {
        int spaces = height - 1;
        int stars = 1;
        int  count = 0;
        while (count <height){
            printSpaces(spaces);
            printStars(stars);
            stars += 2;
            spaces --;
            count ++;
        }
        int test = height - 2;
        printSpaces(test);
        printStars(3);
        printSpaces(test);
        printStars(3);
    }
}
