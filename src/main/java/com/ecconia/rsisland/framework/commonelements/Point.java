package com.ecconia.rsisland.framework.commonelements;

import org.bukkit.Location;

public class Point
{
	private final int x;
	private final int y;
	private final int z;

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

	public Point mul(int amount)
	{
		return new Point(amount * x, amount * y, amount * z);
	}

	public Point add(Point other)
	{
		return new Point(x + other.getX(), y + other.getY(), z + other.getZ());
	}

	@Override
	public String toString()
	{
		return "x:" + x + " y:" + y + " z:" + z;
	}
}
