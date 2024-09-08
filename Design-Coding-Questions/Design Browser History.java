//Problem link: https://leetcode.com/problems/design-browser-history/
//TC: O(Steps) For forward and back operations, O(1) for visit
class LinkNode {
    String val;
    LinkNode next;
    LinkNode prev;
    LinkNode(String x){
        this.val = x;
        this.next = null;
        this.prev = null;
    }
}
class BrowserHistory {
    LinkNode root;
    public BrowserHistory(String homepage) {
        root = new LinkNode(homepage);
    }
    
    public void visit(String url) {
        LinkNode node = new LinkNode(url);
        node.prev = root;
        root.next = node;
        root = root.next;
    }
    
    public String back(int steps) {
        //move back by "steps" steps

        while(steps>0 && root.prev!=null){
            root = root.prev;
            steps--;
        }
        return root.val;
    }
    
    public String forward(int steps) {
        while(steps>0 && root.next!=null){
            root = root.next;
            steps--;
        }
        return root.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
