package BuilderDesignPattern;

public class phone {
	int ram;
	String processor;
	String modelName;
	int androidVersion;
	public phone() {}
	public phone(int ram, String modelName, int androidVersion, String processor) {
		this.ram = ram;
		this.modelName = modelName;
		this.androidVersion = androidVersion;
		this.processor = processor;
		System.out.println("Ram :"+ ram + " modelName: "+modelName+" androidVersion: "+ 
		androidVersion+ " processor: "+processor);
	}
	public int getRam() {
		return ram;
	}
	public phone setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public String getProcessor() {
		return processor;
	}
	public phone setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public String getModelName() {
		return modelName;
	}
	public phone setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}
	public int getAndroidVersion() {
		return androidVersion;
	}
	public phone setAndroidVersion(int androidVersion) {
		this.androidVersion = androidVersion;
		return this;
	}
	
	public phone getDetail() {
		return new phone(ram, modelName, androidVersion, processor);	
		}
}
