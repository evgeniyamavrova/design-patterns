package observer;

public interface ShipmentStatus {
	public void receiving(Package pack);
	public void sending(Package package);
	public String getUpdate();
	public void notifyObsever();
}