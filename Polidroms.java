public class Polidroms {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.println(isPolindrom(args[i]));
        }
    }
    public static String reverseString(String s){  //Переворачиваем строку
        String new_string = "";
        for (int i = s.length() - 1; i >= 0; i--){
            new_string += s.charAt(i);
        }
        return new_string;
    }
    public static Boolean isPolindrom(String s){  //Проверяем строку с перевернутой строкой
        if (s.equals(reverseString(s))){
            return true;
        }
        return false;
    }
}
