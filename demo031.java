import java.util.HashSet;
class HashSetDemo1 {
	@SuppressWarnings("unchecked")
    void HSetMethod() {
		//We can add any type of element here...
		@SuppressWarnings("rawtypes")
        HashSet hashSet = new HashSet();
		hashSet.add(100);
		hashSet.add("PRASUNAMBA");
		hashSet.add(9999.99);
		System.out.println(hashSet);		
//we can use Object class to read any type of elements
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class demo031 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
		}
	}
