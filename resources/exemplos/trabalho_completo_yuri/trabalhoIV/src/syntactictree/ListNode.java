package syntactictree;

public class ListNode extends GeneralNode{
	public GeneralNode node;
	public ListNode next;
	
	public ListNode(GeneralNode node){
		super(node.position);
		this.node = node;
		this.next = null;
	}
	
	public ListNode(GeneralNode node, ListNode next){
		super(node.position);
		this.node = node;
		this.next = next;
	}
	
	public void add(GeneralNode node){
		if(this.next==null){
			this.next = new ListNode(node);
		}else{
			this.next.add(node);
		}
	}
	
}
