package com.ecconia.rsisland.framework.commonelements;

/**
 * A cuboid stores two points as corners.
 * 
 * There are no modifying methods, once created the points cannot be changed anymore.
 * 
 * @author ecconia
 */
public class Cuboid
{
	private final Point p1, p2;
	
	public Cuboid(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point getFirstPoint()
	{
		return p1;
	}
	
	public Point getSecondPoint()
	{
		return p2;
	}
}
