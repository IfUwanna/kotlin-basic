/**
 * Created by jihun.park@navercorp.com on 2022-10-04.
 */
public class Lec8_Function {

    public static void main(String[] args) {
        String[] strings = new String[]{"A","B","C"};
        printAll(strings);
        printAll("A","B","C");
    }

    public int max(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }




    // repeat() - 주어진 문자열을 num 만큼 출력
    public void repeat(String str, int num, boolean useNewLine){
        for (int i = 0; i < num; i++) {
            if(useNewLine){
                System.out.println(str);
            }else{
                System.out.println(str);
            }
        }
    }
    // repeat() 오버로딩
    public void repeat(String str, int num){
        repeat(str,num,true);
    }
    // repeat() 오버로딩
    public void repeat(String str){
        repeat(str,3,true);
    }

    public static void printAll(String... strings) {
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }


}
