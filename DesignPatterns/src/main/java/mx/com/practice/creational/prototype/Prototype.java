package mx.com.practice.creational.prototype;

public interface Prototype extends Cloneable {
	public AccessControl Clone() throws CloneNotSupportedException;
}
