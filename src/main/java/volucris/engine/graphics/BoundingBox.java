package volucris.engine.graphics;

import org.joml.Vector3f;

public class BoundingBox {

	private Vector3f minCorner;
	private Vector3f maxCorner;
	
	private Vector3f center;
	private Vector3f dimension;
	
	public BoundingBox() {
		minCorner = new Vector3f();
		maxCorner = new Vector3f();
		
		center = new Vector3f();
		dimension = new Vector3f();
	}
	
	public BoundingBox(Vector3f minCorner, Vector3f maxCorner) {
		this();
		set(minCorner, maxCorner);
	}
	
	public BoundingBox(BoundingBox boundingBox) {
		this();
		set(boundingBox.minCorner, boundingBox.maxCorner);
	}
	
	public BoundingBox(Vector3f center, float halfWidth, float halfHeight, float halfDepth) {
		this();
		set(center, halfWidth, halfHeight, halfDepth);
	}
	
	public BoundingBox(float centerX, float centerY, float centerZ, float halfWidth, float halfHeight, float halfDepth) {
		this();
		set(centerX, centerY, centerZ, halfWidth, halfHeight, halfDepth);
	}
	
	public void set(Vector3f minCorner, Vector3f maxCorner) {
		this.minCorner.set(minCorner);
		this.maxCorner.set(maxCorner);
		
		this.center.set(minCorner).add(maxCorner).mul(0.5f);
		this.dimension.set(maxCorner).sub(minCorner);
	}
	
	public void set(Vector3f center, float halfWidth, float halfHeight, float halfDepth) {
		this.minCorner.set(center.x - halfWidth, center.y - halfHeight, center.z - halfDepth);
		this.maxCorner.set(center.x + halfWidth, center.y + halfHeight, center.z + halfDepth);
		
		this.center.set(center);
		this.dimension.set(halfWidth * 2, halfHeight * 2, halfDepth * 2);
	}
	
	public void set(float centerX, float centerY, float centerZ, float halfWidth, float halfHeight, float halfDepth) {
		this.minCorner.set(centerX - halfWidth, centerY - halfHeight, centerZ - halfDepth);
		this.maxCorner.set(centerX + halfWidth, centerY + halfHeight, centerZ + halfDepth);
		
		this.center.set(centerX, centerY, centerZ);
		this.dimension.set(halfWidth * 2, halfHeight * 2, halfDepth * 2);
	}
	
	public Vector3f getMinCorner(Vector3f target) {
		return target.set(minCorner);
	}
	
	public Vector3f getMaxCorner(Vector3f target) {
		return target.set(maxCorner);
	}
	
	public Vector3f getCenter(Vector3f target) {
		return target.set(center);
	}
	
	public Vector3f getDimension(Vector3f target) {
		return target.set(dimension);
	}
	
	public float getMinX() {
		return minCorner.x;
	}
	
	public float getMinY() {
		return minCorner.y;
	}
	
	public float getMinZ() {
		return minCorner.z;
	}
	
	public float getMaxX() {
		return maxCorner.x;
	}
	
	public float getMaxY() {
		return maxCorner.y;
	}
	
	public float getMaxZ() {
		return maxCorner.z;
	}
}
