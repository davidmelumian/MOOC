
public class Program {

    public static void main(String[] args) {
        DictionaryOfManyTranslations d1 = new DictionaryOfManyTranslations();
        d1.add("Unix","linux");
        d1.print();
        d1.add("Unix","Tux");
        d1.print();
        System.out.println( d1.translate("Unix"));
        d1.remove("Unix");
        d1.print();
    }
}
