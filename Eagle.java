public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    /**
     * takes off, must be on ground
     */
    @Override
    public void takeOff() {
    	if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky .%n", this.getName());
        }
    	
    };
    
    /**
     * fly upward
     * @param meters elevation increase 
     * @return altitude
     */
	@Override
	public int ascend(int meters) {
		if (this.flying) {
        this.altitude = Math.min(this.altitude + meters, 325);
        System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
    }
    return this.altitude;
    };
	
    /**
     * fly downward
     * @param meters elevation decrease 
     * @return altitude
     */
	@Override
	public int descend(int meters) {
		 if (this.flying) {
	            this.altitude = Math.max(this.altitude - meters, 0);
	            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
	        }
	        return this.altitude;
	};
	
	 /**
     * lands on the ground, must be on the ground
     */
	@Override
	public void land() {
		 if (this.flying && this.altitude <= 1) {
	            System.out.printf("%s lands on the ground.%n", this.getName());
	        } else {
	            System.out.printf("%s is too high, it can't land.%n", this.getName());
	        }
	};
	

    /**
     * glides in the air, must in the air at altitude > 1
     */
	@Override
	public void glide() {
		if (this.flying && this.altitude > 1) {
		System.out.println("glides into the air.");}
	};
	
}
