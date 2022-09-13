/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */
public class Lec5_condition {

    public static void main(String[] args) {
        validateScoreIsNotNegative(-1);
    }

    private static void validateScoreIsNotNegative(int score){
        if(0 <= score && score <= 100){
            throw new IllegalArgumentException(String.format("%s는 0~100",score));
        }
    }

    private String getPassOrFail(int score){
//        if(score >= 50){
//            return "P";
//        }else {
//            return "F";
//        }
        return score >= 50? "P" : "F";
    }
    private String getGrade(int score) {
        switch(score/10){
            case 9: return "A";
            case 8: return "B";
            case 7: return "C";
            default: return "D";
        }
    }




}
