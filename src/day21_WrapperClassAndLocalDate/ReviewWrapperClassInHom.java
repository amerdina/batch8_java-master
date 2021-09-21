package day21_WrapperClassAndLocalDate;

public class ReviewWrapperClassInHom {

	public static void main(String[] args) {
//		 String Str2="25";
//		 byte valueB=Byte.parseByte(Str2);
//          Byte result=(byte) (valueB +100);
//		 System.out.println(result);
//		 Str2=Byte.toString(result);
//		 System.out.println(Str2 +4);
		
		
		
		String Str1="123asdf234ert";
		for(int i=0;i<Str1.length();i++) {
			if(Character.isDigit(Str1.charAt(i))) {
				System.out.println(Str1.charAt(i));
			}
		}
	}

}
