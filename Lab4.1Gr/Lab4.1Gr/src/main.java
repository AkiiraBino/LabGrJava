import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class main {

	public static Boolean isCorrect(String input)
	{
		String regex = "([А-Я]{1}[а-я]+\\s{1}[А-Я]{1}[а-я]+\\s[А-Я]{1}[а-я]+),({1}\\s\\d{2}\\.\\d{2}\\.\\d{4},\\s[А-Я]{1}[а-я]+\\s[а-я]+),(\\s[а-я]+\\s[А-Я]{1}[а-я]+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	public static void main(String[] args)
	{
		String input1 = new String("Шевченко Иван4 Денисович, 08.09.2002, Свердловская область, город Серов");
		String input2 = new String("Шевченко Иван, 08.09.2002, Свердловская область, город Серов");
		String input3 = new String("Шевченко Иван Денисович, 08.2002, Свердловская область, город Серов");
		String input4 = new String("Шевченко Иван Денисович, 08.09.2002, город Серов");
		String input5 = new String("Пустотина Владислава Дмитриевна, 21.11.2007, Приморский край, город Владивосток");
		String input6 = new String("Шевченко Виктория Денисовна, 02.03.2015, Свердловская область, город Полевской");
		System.out.println(isCorrect(input1));
		System.out.println(isCorrect(input2));
		System.out.println(isCorrect(input3));
		System.out.println(isCorrect(input4));
		System.out.println(isCorrect(input5));
		System.out.println(isCorrect(input6));
	}
}
