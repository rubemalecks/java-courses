package classes;

public class Lista {
    
    private No head;

    public void addFirst(Double value) {
        No novoNo = new No();
        novoNo.setValue(value);
        novoNo.setNext(head);
        head = novoNo;
    }

    @Override 
    public String toString() {
        StringBuffer sb = new StringBuffer();
        No p = head;
        sb.append("[");
        while (p != null) {
            sb.append(p.getValue());
            if (p.getNext() == null){
                sb.append("]");
            } else sb.append(", ");
            p = p.getNext();
        }
        
        return sb.toString();
    }

}
