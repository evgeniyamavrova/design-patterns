package observer;
import java.util.ArrayList;
import java.util.List;
public class Packages implements ShipmentStatus {

	private List<Package> packagesSend = new ArrayList<Package>();
	private List<Package> packagesRecieved = new ArrayList<Package>();
	private String name;

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	@Override
	public void receiving(Package pack) {
		this.packagesRecieved.remove(pack);
	}

	@Override
	public void sending(Package pack) {
		this.packagesSend.add(pack);
		pack.setStatus(this);
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

	@Override
	public void notifyObservers() {
		for(Package pack: this.packagesRecieved) {
			pack.update();
		}
	}



}