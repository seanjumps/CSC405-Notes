public class CheeseTester {
	public static void main(String[]args)
	{
		Cheese mozz = new Cheese(false, 4);
		Cheese brie = new Cheese(false, 2);
		System.out.println( mozz.delicious() );
		System.out.println( brie.delicious() );
	}
}