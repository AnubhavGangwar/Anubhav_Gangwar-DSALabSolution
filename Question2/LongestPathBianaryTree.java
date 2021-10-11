package com.GreatLearning.MentoredLabSession3.Question2;

import java.io.*;
import java.util.ArrayList;

public class LongestPathBianaryTree {

	// Binary tree node
	static class Node
	{
		Node rightNode;
		Node leftNode;
		int data;
	}

	// Function to create a new
	// Binary node
	static Node newNode(int data)
	{
		Node temp = new Node();

		temp.data = data;
		temp.leftNode = null;
		temp.rightNode = null;

		return temp;
	}

	// Function to find and return the
	// longest path
	public static ArrayList<Integer> longestPathTree(Node root)
	{


		if(root == null)
		{
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		// Recursive call on root.right
		ArrayList<Integer> right = longestPathTree(root.rightNode);

		// Recursive call on root.left
		ArrayList<Integer> left = longestPathTree(root.leftNode);

		// Compare the size of the two ArrayList
		// and insert current node accordingly
		if(right.size() < left.size())
		{
			left.add(root.data);
		}
		else
		{
			right.add(root.data);
		}

		// Return the appropriate ArrayList
		return (left.size() >
		right.size() ? left :right);
	}

	// Driver Code
	public static void main(String[] args)
	{
		Node root = newNode(100);

		Node node1 = newNode(20);
		Node node2 = newNode(130);
		Node node3 = newNode(10);
		Node node4 = newNode(50);
		Node node5 = newNode(110);
		Node node6 = newNode(140);
		Node node7 = newNode(5);

		node3.leftNode = node7;
		node1.leftNode = node3;
		node1.rightNode = node4;

		node2.leftNode = node5;
		node2.rightNode = node6;

		root.leftNode = node1;
		root.rightNode = node2;

		ArrayList<Integer> output = longestPathTree(root);
		int n = output.size();
		System.out.print(output.get(n - 1));
		for(int i = n - 2; i >= 0; i--)
		{
			System.out.print(" -> " + output.get(i));
		}
	}
}

