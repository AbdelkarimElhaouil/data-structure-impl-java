package mypack;

public class LLnode {
    public int id; // data part
    public LLnode next; // Link part

    public LLnode(int i)
    {
        this.id = i;
        this.next = null;
    }
    public LLnode(int i, LLnode h)
    {
        this.id = i;
        this.next = h;
    }
}
