package Stringlogicalprog;

public class Ex1
{
public static void main(String[] args)
{
String s1="Velocity";
String s2="";
String s3=" ";
String s4="abc";
String s5="ABC";
String s6="my name is abc";
String s7="abcabcab";

s1.length();
{
	
System.out.println(s1.length());//return type int
System.out.println(s2.length());
System.out.println(s3.length());
System.out.println(s1.isEmpty());//return type boolean
System.out.println(s2.isEmpty());
System.out.println(s4.toUpperCase());
System.out.println(s5.toLowerCase());//retuen type char
System.out.println(s1.charAt(2));//char retun type
System.out.println(s7.replaceAll("[a-z]", "1"));
System.out.println(s4.equals(s5));//boolean retuntype false
System.out.println(s4.equalsIgnoreCase(s5));//true
System.out.println(s6.contains("is"));
System.out.println(s6.replace("abc", "smita"));
System.out.println(s5.concat(s4));
System.out.println(s1.substring(2));
System.out.println(s1.substring(2, 5));
System.out.println(s6.startsWith("my"));
System.out.println(s6.endsWith("abc"));
System.out.println(s1.indexOf('i'));
System.out.println(s7.lastIndexOf('a'));
System.out.println(s7.indexOf('a'));
System.out.println(s6.indexOf("abc"));


}
}
}