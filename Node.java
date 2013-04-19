import java.util.*;

public class Node
{
    Node leftChild;
    Node rightChild;
    int value;

    int leftCount;
    int rightCount;

    public Node(int value)
    {
	this.leftChild = null;
	this.rightChild = null;
	this.value = value;
	this.leftCount = 0;
	this.rightCount = 0;
    }
    public int getValue()
    {
	return this.value;
    }
    public Node getRight()
    {
	return this.rightChild;
    }
    public Node getLeft()
    {
	return this.leftChild;
    }
    public Node insert(Node t, Node newOne)
    {
	if(t.equals(null))
	{
	    leftCount++;
	    rightCount++;
	    return newOne;
	}

	// how the heck do we get the color matrix??

	//if colorMatrix == 1
	// left++
	// insert(t.left, newOne);
	// return t;

	//else
	// right++
	// insert(t.right, newOne);
	// return t;
	return t;
    }

    @Override
    public String toString()
    {
	return Integer.toString(this.value);
    }
}