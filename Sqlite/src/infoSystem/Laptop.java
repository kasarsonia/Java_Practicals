package laptopdatasystem;

public class Laptop {
	
	private String brandName;
	private String modelName;
	private Integer sellingPrice;
	
	private Integer displaySize;
	private Integer storageCapacity;
	
	private Boolean isSSD;
	private OperatingSystem operatingSystem;
	
	public Laptop() {
		super();
		this.brandName = "";
		this.modelName = "";
		this.sellingPrice = 0;
		this.displaySize = 0;
		this.storageCapacity = 0;
		this.isSSD = false;
		this.operatingSystem = OperatingSystem.LinuxOS;
	}
	
	public Laptop(String brandName, String modelName, Integer sellingPrice, Integer displaySize,
			Integer storageCapacity, Boolean isSSD, OperatingSystem operatingSystem) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.sellingPrice = sellingPrice;
		this.displaySize = displaySize;
		this.storageCapacity = storageCapacity;
		this.isSSD = isSSD;
		this.operatingSystem = operatingSystem;
	}
	

	
	// getters & setters
	

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Integer getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsSSD() {
		return isSSD;
	}

	public void setIsSSD(Boolean isSSD) {
		this.isSSD = isSSD;
	}

	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
}
