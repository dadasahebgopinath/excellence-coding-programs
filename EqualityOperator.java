public class EqualityOperator  {
	
	public static void main(String[] args) {
		
		// == !=

		String name="Ninja";
		String name2="Ninja";

		boolean result = (name==name2);
		System.out.println(result);

		String n1="Ninja";
		String n2="Ninja";
		System.out.println(n1==n2);


		String n3="Ninja1";
		String n4="Ninja";
		System.out.println(n3!=n4);


	}

// hw  String s1="Coder" ; String s2="Coder"  s1 ? s2 == true
// hw  String s1="Coder" ; String s2="Coder"  s1 ? s2 == false

}