
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date.*;
public class GenesisNode
{
	public void Node(String ownerName , int nOChild) 
	{
		Date timestamp;
		String data;
		int nodeNumber= 0;
		String nodeId;
		String referenceNodeId;
		String[] childReferenceNodeId = null;
		final String genisisReferenceNodeId =  "xxyza1234";
		String hashValue;
		
		ArrayList Owner = new ArrayList() ;
		
		
		UUID id = UUID.randomUUID();
		nodeId = id.toString();
		System.out.println(nodeId);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
		timestamp = new Date();;
		System.out.println(dateFormat.format(timestamp));
		
		Owner.add(ownerName);
		Owner.add(nodeId);
		
		
		data = nodeId + ownerName + Owner.hashCode(); 
		
		
	int newNodeNumber =	nodeNumber++;
		
	UUID ref	= UUID.randomUUID();
	referenceNodeId = ref.toString();
	for(int i = 0 ; i < nOChild ; i++)
	{
		UUID Cref	= UUID.randomUUID();
		childReferenceNodeId[i] = Cref.toString();
	}	
	HashSet hasvalue = new HashSet();
	hasvalue.add(timestamp);
	hasvalue.add(data);	
	hasvalue.add(newNodeNumber);	
	hasvalue.add(referenceNodeId);
	hasvalue.add(childReferenceNodeId);
	hasvalue.add(genisisReferenceNodeId);
	
	String HashValue =  hasvalue.hashCode() + "";
	
	LinkedList genesis = new LinkedList();
	
	genesis.add(timestamp);
	genesis.add(data);
	genesis.add(newNodeNumber);
	genesis.add(nodeId);
	genesis.add(referenceNodeId);
	genesis.add(childReferenceNodeId);
	genesis.add(genisisReferenceNodeId);
	genesis.add(HashValue);
	
	
	
	}

}
