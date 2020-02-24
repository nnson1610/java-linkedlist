public class LinkedList {
	Node head;

	public void insert(int data) {
		// Create a node
		Node node = new Node(data);
		node.next = null;

		// When list is empty, set node as head
		if (head == null) {
			head = node;
		} else {
			// Finding last node 
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert a node at last node
			last.next = node;
		}
	}
	
    public void deleteLastItem() 
    { 
        // Store head node 
		Node last = head, prev = null;
		
		// Finding last node
		while (last.next != null) {
            prev = last; 
            last = last.next;
		}
		
		// Delete last node
		prev.next= null; 
    } 
    
    public void deleteGreaterValue(int value) 
    { 
        // Store head node 
        Node currentNode = head, temp = null; 

        // Loop through the LinkedList
        while (currentNode != null) { 
        	// Check head value, if greater than value, then delete node
        	if (currentNode.data > value) {
                head = currentNode.next; // Changed head 
                currentNode = head; 
        	} 
        	// Check next node, if greater than value, then delete node
        	else if (currentNode.next != null && currentNode.next.data > value){
                temp = currentNode.next; 
                currentNode.next = temp.next; 
                temp = null; 
        	} 
        	// Go to next node
        	else {
        		currentNode = currentNode.next; 
        	}

        } 
    } 

	public String toString() {
		StringBuilder str = new StringBuilder();
		Node currentNode = head;

		// Loop through the LinkedList
		while (currentNode != null) {
			str.append(currentNode.data + " ");

			// Go to next node
			currentNode = currentNode.next;
		}
		return str.toString();
	}
}
