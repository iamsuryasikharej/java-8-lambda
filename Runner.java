package lamda;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		List<Person> l=Arrays.asList(
				new Person("surya","sikha",25),
				new Person("zebra","zoo",25),
				new Person("yoda","yoo",100),
				new Person("jasper","joo",25),
				new Person("vicks","voo",25));
				Collections.sort(l,new Comparator<Person>() {

					@Override
					public int compare(Person o1,Person o2) {
						return o2.getLn().compareTo(o1.getLn());
					}
				});
//		print(l);
		Condition c1=(x)->{if(x.getLn().startsWith("s")) 
			return true;
		return false;
		
		};
		Condition c2=(x)->{if(x.getAge()>25)
			return true;
		return false;};
		printConditonally(l,c2);
		
	}

	private static void printConditonally(List<Person> l,Condition c) {
		for(Person p:l)
		{
			if(c.condition(p))
			{
				System.out.println(p.getFn());
			}
		}
		
		
	}

	private static void print(List<Person> l) {
		for(Person p:l)
		{
			System.out.println(p.getLn());
		}
	}

}

