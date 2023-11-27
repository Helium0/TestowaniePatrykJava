import java.util.*;
public class CountTextValue {

        public static void main(String[] args) {
            CountTextValue countTextValue = new CountTextValue();
            countTextValue.countTextMethod("Ala ma kota, kota ma Ala");

        }

        public String countTextMethod(String text){
            HashMap<String,Integer> count = new HashMap();
            String [] result = text.split("[ ,.]+");
            for( String i : result){
                Integer num = count.get(i);
                if ( num == null){
                    num =0;
                }
                count.put(i, ++num);
            }
            for ( String i : result){
            }
            System.out.println(count);
            return "Ala ma kota, kota ma Ala";
        }
    }

