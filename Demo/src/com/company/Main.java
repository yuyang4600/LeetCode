package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BitNode {
    int data;
    BitNode lchild;
    BitNode rchild;

    public void setNode(int data, BitNode lc, BitNode rc) {
        this.data = data;
        lchild = lc;
        rchild = rc;
    }


    static int counter = 0;//定义一个静态计数变量

    /**
     * 构造二叉树
     *
     * @param root根节点
     * @param a数据源
     * @param i计数器
     * @return 根节点
     */
    public static BitNode createBiTree(BitNode root, List a, int i) {
        if (i < a.size()) {
            if (a.get(i).equals(0)) {
                root = null;
            } else {
                BitNode lchild = new BitNode();
                BitNode rchild = new BitNode();
                root.data = (int)a.get(i);
                root.lchild = createBiTree(lchild, a, ++counter);
                root.rchild = createBiTree(rchild, a, ++counter);
            }
        }
        return root;
    }

    // 访问节点
    public static void visitTNode(BitNode node) {
        System.out.print(node.data + " ");
    }

    // 层次遍历
    public static void levelTraverse(BitNode root) {
        Queue<BitNode> queue = new LinkedList<BitNode>();
        queue.offer(root);// 从根节点入队列
        while (!queue.isEmpty()) {// 在队列为空前反复迭代
            BitNode bitNode = queue.poll();// 取出队列首节点
            visitTNode(bitNode);
            if (bitNode.lchild != null)
                queue.offer(bitNode.lchild);// 左孩子入列
            if (bitNode.rchild != null)
                queue.offer(bitNode.rchild);// 右孩子入列
        }
    }

    public static void main(String[] args) {
        BitNode root = new BitNode();
        List list = new ArrayList();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j ++) {
                if (i == grid.length - 1 && j == grid[i].length - 1) {
                    list.add(null);
                }else if (i == grid.length - 1) {
                    list.add(grid[i][j + 1]);
                }else if (j == grid[i].length - 1) {
                    list.add(grid[i + 1][j]);
                }else {
                    list.add(grid[i + 1][j]);
                    list.add(grid[i][j + 1]);
                }
            }
        }

        root = createBiTree(root, list, counter);
        levelTraverse(root);
    }
}

/*
建个分支测试一下
测试1
测试2
测试3
 */