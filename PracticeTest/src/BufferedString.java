
public class BufferedString {
	
	public static void methodrev(String str)
		{	
			StringBuffer bfs = new StringBuffer(str);
			 System.out.println(bfs.reverse());
		}

	public static void main(String[] args) {
		//calling the methodrev
		methodrev("Madugam");
	}

}
