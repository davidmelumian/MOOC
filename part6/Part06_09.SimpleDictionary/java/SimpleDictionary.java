    
import java.util.HashMap;

public class SimpleDictionary {
    public HashMap<String,String> translations; // создание хешмапа
    public  SimpleDictionary(){  //конструктор
        this.translations=new HashMap<>();
    }
    public String translate(String key){
      return   this.translations.get(key);
    }
    public void add(String key,String value){
        this.translations.put(key,value);
    }

}
