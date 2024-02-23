package hello.algorithm.structure;

/**
 * @author qr
 * 2024年02月23日 11:05
 */
public class PlayerNode {
    private String name;
    private PlayerNode next;

    public PlayerNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }
}
