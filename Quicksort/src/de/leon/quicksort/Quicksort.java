package de.leon.quicksort;

import java.util.ArrayList;
//import java.util.Scanner;

public class Quicksort
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// For use with user input
		/*
		System.out.println("Please enter the 10 Integers to sort.");
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + ": ");
			list.add(scanner.nextInt());
		}
		scanner.close();
		*/
		
		list.add(6);
		list.add(19);
		list.add(12);
		list.add(18);
		list.add(15);
		list.add(3);
		list.add(24);
		list.add(17);
		list.add(8);
		list.add(4);
		
		System.out.println("Input: " + list);
		list = quicksort(list);
		System.out.println("Output: " + list);
	}

	private static ArrayList<Integer> combine (ArrayList<Integer> list1, int pivot, ArrayList<Integer> list2)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (!list1.isEmpty())
		{
			for (int x : list1)
			{
				list.add(x);
			}
		}
		
		list.add(pivot);
		
		if (!list2.isEmpty())
		{
			for (int x : list2)
			{
				list.add(x);
			}
		}
		
		return list;
	}
	
	private static ArrayList<Integer> quicksort (ArrayList<Integer> list)
	{
		if (!list.isEmpty())
		{
			int pivot = list.get(0);
			list.remove(list.indexOf(pivot));
			
			ArrayList<Integer> smaller = new ArrayList<Integer>();
			ArrayList<Integer> bigger = new ArrayList<Integer>();
			for (int x : list)
			{
				if (x < pivot)
				{
					smaller.add(x);
				}
				else if (x > pivot)
				{
					bigger.add(x);
				}
				
				//list.remove(list.indexOf(x));
			}
			
			list = combine(quicksort (smaller), pivot, quicksort (bigger));
			
			return list;
		}
		
		return new ArrayList<Integer>();
	}
}
