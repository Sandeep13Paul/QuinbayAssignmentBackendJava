package HackerRankSolutions.JavaVisitorPattern;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        // Do nothing for non-leaf nodes
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int M = 1000000007;

    public int getResult() {
        return (int)result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthNonLeafSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthNonLeafSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthNonLeafSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}

public class Solution {

    private static int[] values;
    private static Color[] colors;
    private static Map<Integer, Set<Integer>> edges;

    public static Tree solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Read values
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scan.nextInt();
        }

        // Read colors
        colors = new Color[n];
        for (int i = 0; i < n; i++) {
            colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        // Read and store edges
        edges = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt() - 1;  // Convert to 0-based indexing
            int v = scan.nextInt() - 1;

            // Add edges to both vertices (undirected graph)
            edges.computeIfAbsent(u, k -> new HashSet<>()).add(v);
            edges.computeIfAbsent(v, k -> new HashSet<>()).add(u);
        }

        scan.close();

        // Build and return the tree starting from root (node 0)
        return buildTree(0, 0);
    }

    private static Tree buildTree(int node, int depth) {
        Set<Integer> children = edges.getOrDefault(node, new HashSet<>());
        if (children.isEmpty()) {
            // Leaf node
            return new TreeLeaf(values[node], colors[node], depth);
        } else {
            // Internal node
            TreeNode treeNode = new TreeNode(values[node], colors[node], depth);
            for (int child : children) {
                edges.get(child).remove(node);  // Remove parent edge to prevent cycles
                treeNode.addChild(buildTree(child, depth + 1));
            }
            return treeNode;
        }
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
