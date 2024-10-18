package Three;

/*
C) Write a program to read ‘n’ integers and store them in a Binary search tree 
and display the nodes level wise.*/

class Node {
    int value;
    Node left, right;

    Node(int item) {
        value = item;
        left = right = null;
    }
}

