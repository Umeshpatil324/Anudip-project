
import java.util.PriorityQueue;
import java.util.Scanner;
class Node{
    int frequency;
    char symbol;
    Node left,right;
    public Node(int frequency,char symbol){
        this.frequency = frequency;
        this.symbol = symbol;
        this.left = null;
        this.right = null;
    }    
    
}
class NodeComparator implements java.util.Comparator<Node>{
    public int compare(Node n1,Node n2){
        return n1.frequency-n2.frequency;
    
    }
}
public class HuffmanEncoding{
    private static Node buildHuffmanTree(char[]characters,int[] frequencies){
        PriorityQueue<Node>queue= new PriorityQueue<>(new NodeComparator());
        ){
            queue.add(new Node (frequencies[i],characters[i]));

        }
        while (queue.size()>1){

            Node left = queue.poll();
            Node right = queue.poll();
            Node newNode = new Node(left.frequency+ right.frequency,'-');
            newNode.left = left;
            newNode.right = right;
            queue.add(newNode);
        }
        return queue.poll();   
    }
    private static void printHuffmanCodes(Node root,String code){
        if(root.left==null && root.right == null && Character.isLetter(root.symbol)){
            System.out.println(root.symbol + "->" + code);
            return;
        }
        if(root.left !=null){
            printHuffmanCodes(root.left,code + "0");

        }
        if (root.right != null){
            printHuffmanCodes(root.right,code + "1");

        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter characters(without spaces):");
        String inputChars = scanner.nextLine();
        char[] characters = inputChars.toCharArray();

        System.out.print("enter correspoding frequencies(separated by spaces):");
        String[]inputFreqs =scanner.nextLine().split(" ");
        int[] frequencies  = new int [inputFreqs.length];

        for(int i=0; i<inputFreqs.length; i++){
            frequencies[i] =Integer.parseInt(inputFreqs[i]);
        }
        Node root = buildHuffmanTree(characters,frequencies);
        System.out.println("Huffman codes:");
        printHuffmanCode(root,"");

        scanner.close();
        
        
    }
}
