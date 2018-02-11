package q101Unique;

public class UnivqieQ1 {
	public static boolean uniqueDetect(String s){
		if (s.length() > 128){
			return false;
		} else {		
		boolean[] char_Set = new boolean[128];
		for (int i =0; i<s.length(); i++){
			int var = s.charAt(i);
			if(char_Set[var]){
				return false;
			}
			char_Set[var] = true;
		}
		return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myString = new String[]{"workdk","sjfisjf","jdkfljaslkfj","jdkafjl"};
		for (String subString : myString){
			System.out.println(subString +"is "+ uniqueDetect(subString));
		}
	}

}
