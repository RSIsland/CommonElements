package com.ecconia.rsisland.framework.commonelements;

import org.bukkit.World;

public class Area
{
	private World world;
	
	private final Point min;
	private final Point max;
	
	public Area(World world, Point one, Point two)
	{
		this.world = world;
		this.min = one;
		this.max = two;
	}
	
	public Point getMin()
	{
		return min;
	}
	
	public Point getMax()
	{
		return max;
	}
	
	public World getWorld()
	{
		return world;
	}
}
