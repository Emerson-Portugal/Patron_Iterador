package SinLibreria;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
	      NameRepository cmpnyRepository = new NameRepository();
	      
	      for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}

