
public class main {

	public static void main(String[] args) {
		nissan a = new nissan();
		toyota b = new toyota();
        truck  c = new truck();
        
        System.out.println(c.model+a.model);
		System.out.println(c.color+a.color);
		System.out.println(c.size+a.size);
		System.out.println(c.speed+a.speed+" km/h");
		c.speed();
		c.storage();
		
		System.out.println();
		
		System.out.println(c.model+b.model);
		System.out.println(c.color+b.color);
		System.out.println(c.size+b.size);
		System.out.println(c.speed+b.speed+" km/h");
		c.speed();
		c.storage();
	}

}
