package com.greatlearning.gradedproject2.assignment2;

import java.util.ArrayList;

public class SkewTree {
	
	ArrayList<Integer> dataList = new ArrayList<>();

	void inOrder(Node root) {
		
		if (root != null) {
			inOrder(root.left);
			dataList.add(root.data);
			inOrder(root.right);
		}
	}
	
	Node skewingTree() {
		
		Node root = null;
		Node tempNode =null;
		for(int i=0; i<dataList.size(); i++) {
			int data = dataList.get(i);
			Node nn = new Node(data);
			if(root == null) {
				root=nn;
				tempNode = nn;
			}else if(tempNode.right == null){
				tempNode.right=nn;
				tempNode=nn;
			}
		}
		return root;
	}

}
