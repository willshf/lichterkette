public class ListAdvanced extends List
{
    public void nextAdvanced() {
    while(!(current.getNextNode()==null)){
        if (this.hasAccess()) {
            current = current.getNextNode();
        }
    }
    }
}
