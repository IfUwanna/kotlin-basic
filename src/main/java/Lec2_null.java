public class Lec2_null {

    public static void main(String[] args) {

    }
    // 0. NPE
    public boolean startsWithA(String str){
        return str.startsWith("A");
    }

    // 1. null 체크 IllegalArgumentException
    public boolean startsWithA1(String str){
        if(str == null){
            throw new IllegalArgumentException("Null이 들어옴");
        }
        return str.startsWith("A");
    }

    // 2. Boolean Null반환
    public Boolean startsWithA2(String str){
        if(str == null){
            return null;
        }
        return str.startsWith("A");
    }

    // 3. null이면 false 반환
    public boolean startsWithA3(String str){
        if(str == null){
            return false;
        }
        return str.startsWith("A");
    }

}
