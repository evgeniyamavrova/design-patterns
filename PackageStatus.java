package observer;

public class PackageStatus implements Package {

	private String name;
	private ShipmentStatus packageStatus;
	
	public PackageStatus(String name) {
		this.setName(name);
	}
	@Override
	public void update() {
		if(packageStatus == null) {
			System.out.println("No package");
			return;
		}
		
		String packStatus = packageStatus.getUpdate();
		System.out.println(this.getName() + " updated: " + "Status is: " + packStatus);
	}
	@Override
	public void setStatus(ShipmentStatus status) {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
