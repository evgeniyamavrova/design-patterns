package observer;

public class Main {

	public static <Topic> void main(String[] args, Object pack) {
		Topic topic = new Topic();
		Package observer1 = new PackageStatus("package 1");
		Package observer2 = new PackageStatus("package 2");
		Package observer3 = new PackageStatus("package 3");
		
	    pack.receiving(observer1);
		pack.sending(observer2);
		pack.recieving(observer3);
		
	}

}
