
public class Book {
    private String  name;
    private int year;
    public  Book (String  name, int year){
        this.name=name;
        this.year=year;
    }
    public boolean  equals (Object compared){
        // находятся ли обьекты по одному адресу
        if(this==compared){
            return  true;
        }// принадлежит ли сравниваемый обьект к типу класса Book
        if (!(compared instanceof  Book)){
            return false;
        }
        // конвертация обьекта в обьект типа Book
        Book comparedBook = (Book) compared;
        // сравнение обычных параметров
        if (this.name.equals(comparedBook.name)&&
                this.year==comparedBook.year){
            return true;
        }
        return  false;
    }
}
