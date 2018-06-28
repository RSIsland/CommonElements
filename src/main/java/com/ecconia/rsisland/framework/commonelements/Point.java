package com.ecconia.rsisland.framework.commonelements;

import org.bukkit.Location;

/**
 * A point stores x, y, z as natural number.
 * 
 * There are no modifying methods, once created the numbers cannot be changed anymore.
 * 
 * @author ecconia
 */
public class Point
{
	private final int x, y, z;
	
	//#########################################################################
	
	public Point(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point(Location location)
	{
		this.x = location.getBlockX();
		this.y = location.getBlockY();
		this.z = location.getBlockZ();
	}
	
	public Point(Point point)
	{
		this.x = point.getX();
		this.y = point.getY();
		this.z = point.getZ();
	}
	
	//#########################################################################
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public Point clone()
	{
		return new Point(this);
	}
	
	//#########################################################################
	
	/**
	 * Multiplies the thee coords by a value.
	 * 
	 * @param amount - by how much the point should be multiplied
	 * @return Point - a new Point object with the result as value
	 */
	public Point mul(int amount)
	{
		return new Point(amount * x, amount * y, amount * z);
	}
	
	/**
	 * Adds another Point to this Point.
	 * 
	 * @param other - the other Point to be added to this
	 * @return Point - a new Point object with the result as value
	 */
	public Point add(Point other)
	{
		return new Point(x + other.getX(), y + other.getY(), z + other.getZ());
	}
	
	//#########################################################################
	
	@Override
	public String toString()
	{
		return "x:" + x + " y:" + y + " z:" + z;
	}
}
