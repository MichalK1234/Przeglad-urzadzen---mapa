
public class Device {

	private String name;
	private Integer workTime;
	private double costOfService;
	private String clas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Integer workTime) {
		this.workTime = 0;
		if (workTime >= 0 && workTime <= 120) {
			this.workTime = workTime;
		}
	}

	public double getCostOfService() {
		return costOfService;
	}

	public void setCostOfService(double costOfService) {
		this.costOfService = 1;
		if (costOfService > 0) {
			this.costOfService = costOfService;
		}
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		if (clas.matches("A|B|C|D")) {
			this.clas = clas;
		} else {
			this.clas = "A";
		}
	}

	public Device(String name, Integer workTime, double costOfService, String clas) {
		super();

		setName(name);
		setWorkTime(workTime);
		setCostOfService(costOfService);
		setClas(clas);
	}

	public Device() {

	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", workTime=" + workTime + ", costOfService=" + costOfService + ", clas=" + clas
				+ "]";
	}

}
