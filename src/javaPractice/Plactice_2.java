package javaPractice;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Plactice_2 {
//	String 型の変数を宣言して任意の文字列を代入し、コンソールログに出力すること
	public static void one(String[] args) {
        String first = "String 型の変数を宣言して任意の文字列を代入し、コンソールログに出力すること";
        System.out.println(first);
    }
	
//	宣言したString 型の変数に任意の文字列を**文字列連結**して代入し、コンソールログに出力すること
	public static void two(String[] args) {
        String second = "宣言したString 型の変数に任意の文字列を";
        String third = "**文字列連結**して代入し、";
        String four = "コンソールログに出力すること";
        String result = second + third + four;
        System.out.println(result);
    }
	
//	Integer 型の変数を宣言して任意の整数値を代入し、コンソールログに出力すること
	Integer number = 100;

//	int 型の変数を宣言して任意の整数値を代入し、コンソールログに出力すること
	int Value = 200;
	
//	宣言したString 型の変数に任意の整数値を代入してから、宣言した int 型の変数に代入し、コンソールログに出力すること
	public static void three(String[] args) {
        String stringNumber = "300";
        int intNumber = Integer.parseInt(stringNumber);
        System.out.println("String value: " + stringNumber);
        System.out.println("Converted int value: " + intNumber);
    }
	
//	宣言した int 型の変数に 10 加算してコンソールログに出力すること
	public static void fours(String[] args) {
        int Value = 400;
        Value += 10;
        System.out.println(Value);
    }
	
//	宣言した int 型の変数を BigDecimal 型の変数を宣言して代入し、コンソールログに出力すること（少数点第一位まで表示する）
	public static void fifth(String[] args) {
        int five = 500;
        BigDecimal six = new BigDecimal("123.45");
        
        BigDecimal fifthAsBigDecimal = BigDecimal.valueOf(five);
        System.out.println(fifthAsBigDecimal.setScale(1, RoundingMode.HALF_UP));
        System.out.println(six.setScale(1, RoundingMode.HALF_UP));
    }
	
//	宣言した BigDecimal 型の変数に対して、２除算してコンソールログに出力すること
	public static void sixth(String[] args) {
        BigDecimal seventh = new BigDecimal("600");
        BigDecimal result = seventh.divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        System.out.println(result);
    }

	
//	宣言した String 型の変数に任意の日付を代入して、java.util.Date 型の変数に代入し、コンソールログに出力すること（日付のフォーマットは “yyyy/MM/dd “ とする。throw 宣言の追加が必要。）
	String day = "10月30日";
	public static void seventh(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
	
	public static void days() {
        String day = "10月30日";
        SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日");
        try {
            Date date = formatter.parse(day);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
	
//	宣言した java.util.Date 型の変数に、2日加算してコンソールログに出力すること
	public static void eighth(String[] args) {
        Date date = new Date(); 
        System.out.println(date); 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 2); 
        Date newDate = calendar.getTime();
        System.out.println(newDate);
    }
	
	
}
