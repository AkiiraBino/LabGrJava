import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class main {

	public static Boolean isCorrect(String input)
	{
		String regex = "([�-�]{1}[�-�]+\\s{1}[�-�]{1}[�-�]+\\s[�-�]{1}[�-�]+),({1}\\s\\d{2}\\.\\d{2}\\.\\d{4},\\s[�-�]{1}[�-�]+\\s[�-�]+),(\\s[�-�]+\\s[�-�]{1}[�-�]+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	public static void main(String[] args)
	{
		String input1 = new String("�������� ����4 ���������, 08.09.2002, ������������ �������, ����� �����");
		String input2 = new String("�������� ����, 08.09.2002, ������������ �������, ����� �����");
		String input3 = new String("�������� ���� ���������, 08.2002, ������������ �������, ����� �����");
		String input4 = new String("�������� ���� ���������, 08.09.2002, ����� �����");
		String input5 = new String("��������� ���������� ����������, 21.11.2007, ���������� ����, ����� �����������");
		String input6 = new String("�������� �������� ���������, 02.03.2015, ������������ �������, ����� ���������");
		System.out.println(isCorrect(input1));
		System.out.println(isCorrect(input2));
		System.out.println(isCorrect(input3));
		System.out.println(isCorrect(input4));
		System.out.println(isCorrect(input5));
		System.out.println(isCorrect(input6));
	}
}
