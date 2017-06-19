/*
 * Copyright � 2014 - 2017 | Wurst-Imperium | All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wurstclient.files;

public enum DefaultAutoBuildTemplates
{
	BRIDGE("Bridge",
		new int[][]{{1, 0, 0}, {0, 0, 0}, {-1, 0, 0}, {1, 0, -1}, {0, 0, -1},
			{-1, 0, -1}, {1, 0, -2}, {0, 0, -2}, {-1, 0, -2}, {1, 0, -3},
			{0, 0, -3}, {-1, 0, -3}, {1, 0, -4}, {0, 0, -4}, {-1, 0, -4},
			{1, 0, -5}, {0, 0, -5}, {-1, 0, -5}}),
	
	FLOOR("Floor", new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 0, 1}, {-1, 0, 1},
		{1, 0, 0}, {-1, 0, 0}, {1, 0, -1}, {0, 0, -1}, {-1, 0, -1}, {2, 0, 2},
		{1, 0, 2}, {0, 0, 2}, {-1, 0, 2}, {-2, 0, 2}, {2, 0, 1}, {-2, 0, 1},
		{2, 0, 0}, {-2, 0, 0}, {2, 0, -1}, {-2, 0, -1}, {2, 0, -2}, {1, 0, -2},
		{0, 0, -2}, {-1, 0, -2}, {-2, 0, -2}, {3, 0, 3}, {2, 0, 3}, {1, 0, 3},
		{0, 0, 3}, {-1, 0, 3}, {-2, 0, 3}, {-3, 0, 3}, {3, 0, 2}, {-3, 0, 2},
		{3, 0, 1}, {-3, 0, 1}, {3, 0, 0}, {-3, 0, 0}, {3, 0, -1}, {-3, 0, -1},
		{3, 0, -2}, {-3, 0, -2}, {3, 0, -3}, {2, 0, -3}, {1, 0, -3}, {0, 0, -3},
		{-1, 0, -3}, {-2, 0, -3}, {-3, 0, -3}}),
	
	NAZI("Nazi",
		new int[][]{{0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {0, 1, 0}, {0, 2, 0},
			{1, 2, 0}, {2, 2, 0}, {2, 3, 0}, {2, 4, 0}, {0, 3, 0}, {0, 4, 0},
			{-1, 4, 0}, {-2, 4, 0}, {-1, 2, 0}, {-2, 2, 0}, {-2, 1, 0},
			{-2, 0, 0}}),
	
	PENIS("Penis",
		new int[][]{{0, 0, 0}, {1, 0, 0}, {1, 0, 1}, {0, 0, 1}, {0, 1, 0},
			{1, 1, 0}, {1, 1, 1}, {0, 1, 1}, {0, 2, 0}, {1, 2, 0}, {1, 2, 1},
			{0, 2, 1}, {0, 3, 0}, {1, 3, 0}, {1, 3, 1}, {0, 3, 1}, {0, 4, 0},
			{1, 4, 0}, {1, 4, 1}, {0, 4, 1}, {0, 5, 0}, {1, 5, 0}, {1, 5, 1},
			{0, 5, 1}, {0, 6, 0}, {1, 6, 0}, {1, 6, 1}, {0, 6, 1}, {0, 7, 0},
			{1, 7, 0}, {1, 7, 1}, {0, 7, 1}, {2, 0, -1}, {3, 0, -1}, {3, 0, -2},
			{2, 0, -2}, {2, 1, -1}, {3, 1, -1}, {3, 1, -2}, {2, 1, -2},
			{-1, 0, -1}, {-2, 0, -1}, {-2, 0, -2}, {-1, 0, -2}, {-1, 1, -1},
			{-2, 1, -1}, {-2, 1, -2}, {-1, 1, -2}}),
	
	PILLAR("Pillar", new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 2, 0}, {0, 3, 0},
		{0, 4, 0}, {0, 5, 0}, {0, 6, 0}}),
	
	WALL("Wall",
		new int[][]{{3, 0, 0}, {2, 0, 0}, {1, 0, 0}, {0, 0, 0}, {-1, 0, 0},
			{-2, 0, 0}, {-3, 0, 0}, {3, 1, 0}, {2, 1, 0}, {1, 1, 0}, {0, 1, 0},
			{-1, 1, 0}, {-2, 1, 0}, {-3, 1, 0}, {3, 2, 0}, {2, 2, 0}, {1, 2, 0},
			{0, 2, 0}, {-1, 2, 0}, {-2, 2, 0}, {-3, 2, 0}, {3, 3, 0}, {2, 3, 0},
			{1, 3, 0}, {0, 3, 0}, {-1, 3, 0}, {-2, 3, 0}, {-3, 3, 0}, {3, 4, 0},
			{2, 4, 0}, {1, 4, 0}, {0, 4, 0}, {-1, 4, 0}, {-2, 4, 0}, {-3, 4, 0},
			{3, 5, 0}, {2, 5, 0}, {1, 5, 0}, {0, 5, 0}, {-1, 5, 0}, {-2, 5, 0},
			{-3, 5, 0}, {3, 6, 0}, {2, 6, 0}, {1, 6, 0}, {0, 6, 0}, {-1, 6, 0},
			{-2, 6, 0}, {-3, 6, 0}}),
	
	WURST("Wurst", new int[][]{{0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {-1, 0, 0},
		{-2, 0, 0}, {0, 1, 0}, {1, 1, 0}, {2, 1, 0}, {3, 1, 0}, {-1, 1, 0},
		{-2, 1, 0}, {-3, 1, 0}, {0, 1, -1}, {1, 1, -1}, {2, 1, -1}, {-1, 1, -1},
		{-2, 1, -1}, {0, 1, 1}, {1, 1, 1}, {2, 1, 1}, {-1, 1, 1}, {-2, 1, 1},
		{0, 2, 0}, {1, 2, 0}, {2, 2, 0}, {-1, 2, 0}, {-2, 2, 0}});
	
	private final String name;
	private final int[][] data;
	
	private DefaultAutoBuildTemplates(String name, int[][] data)
	{
		this.name = name;
		this.data = data;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int[][] getData()
	{
		return data;
	}
}