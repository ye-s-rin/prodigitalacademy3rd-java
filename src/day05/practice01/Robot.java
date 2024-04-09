
public class Robot {
    Machine location;
    String bin;

    public Robot() {}

    public Machine location() {
    	return location;
    }
    
    public void moveTo(Machine location) {
    	this.location = location;
    }

    public void pick() {
    	this.bin = location.take();
    }
    
    public String bin() {
    	return bin;
    }

    public void release() {
        location.put(bin);
        bin = null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        if (location != null)
            sb.append(" location=").append(location.name());

        if (bin != null)
            sb.append(" bin=" ).append(bin);

        return sb.toString();
    }
}
