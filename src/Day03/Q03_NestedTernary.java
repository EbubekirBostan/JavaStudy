package Day03;

public class Q03_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char not= 'B';
        String result= not=='A'?"Gayet Basarili":
                       not=='B'? "Basarili":
                       not=='C'? "Ha gayret": "Dgerleri";
        System.out.println("result = " + result);


    }
}
